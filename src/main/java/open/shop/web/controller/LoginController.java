package open.shop.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import lombok.RequiredArgsConstructor;
import open.shop.Const;
import open.shop.domain.member.Member;
import open.shop.domain.member.MemberService;
import open.shop.web.dto.LoginDto;
import open.shop.web.dto.MemberDto;

@Controller
@RequiredArgsConstructor	
public class LoginController {
	
	private final MemberService memberService;
	
	
	@GetMapping("/")
	public String home(@SessionAttribute(name = Const.LOGIN_MEMBER, required = false)
						Member loginMember, Model model) {
		if(loginMember == null) {
			return "home";
		}
		model.addAttribute("member", new MemberDto(loginMember));
		return "home";
	}
	
	
	
	@GetMapping("/login")
	public String loginForm(@ModelAttribute("login")LoginDto loginDto) {
		return "loginForm";
	}	
	
	@PostMapping("/login")
	public String login(@ModelAttribute("login")LoginDto loginDto, HttpServletRequest request) {
		
		Member findMember = memberService.loginCheck(loginDto);
		
		if(findMember == null) {
			System.out.println("아이디 또는 비밀번호가 올바르지 않습니다");
			return "loginForm";
		}
		
		HttpSession session = request.getSession();
		session.setAttribute(Const.LOGIN_MEMBER, findMember);
		
		return "redirect:/";
	}
	
	@GetMapping("logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			session.invalidate();
		}
		
		return "redirect:/";
	}
	
}
