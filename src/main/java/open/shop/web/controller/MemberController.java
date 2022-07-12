package open.shop.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import lombok.RequiredArgsConstructor;
import open.shop.Const;
import open.shop.domain.member.Member;
import open.shop.domain.member.MemberService;
import open.shop.web.dto.MemberDto;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	

	@GetMapping("/join")
	public String joinForm(@ModelAttribute("member")MemberDto memberDto) {
		
		return "member/joinForm";
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute("member")MemberDto memberDto, HttpServletRequest request) {
		
		Member member = Member.createMember(memberDto);
		memberService.save(member);
		HttpSession session = request.getSession();
		session.setAttribute(Const.LOGIN_MEMBER, member);
					
		return "redirect:/";
	}
	
	@GetMapping("/info")
	public String info(@SessionAttribute(name = Const.LOGIN_MEMBER, required = false)
						Member loginMember, Model model) {
		
		Member member = memberService.findById(loginMember.getId());
		model.addAttribute("member", new MemberDto(member));
		
		return "member/info";
	}
	
	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable Long id, Model model) {
		
		Member member = memberService.findById(id);
		model.addAttribute("member",new MemberDto(member));
		
		return "member/editForm";
	}
	
	@PostMapping("/edit/{id}")
	public String edit(@PathVariable Long id, @ModelAttribute("member")MemberDto memberDto) {
		Member member = Member.updateMember(id, memberDto);
		memberService.update(member);
		return "redirect:/member/info";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, HttpServletRequest request) {	
		
		memberService.delete(id);
		
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			session.invalidate();
		}
		
		return "redirect:/";
	}
	
	
	
	
	
}
