package open.shop.domain.member;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import open.shop.web.dto.LoginDto;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberMapper memberMapper;
	
	
	
	
	public Member loginCheck(LoginDto loginDto) {
		
		Member findMember = memberMapper.findByName(loginDto.getName())
				.orElseThrow(()->new NoSuchElementException("없는 아이디입니다"));
		
		if(findMember.getPassword().equals(loginDto.getPassword())) {
			return findMember;
		}else {
			return null;
		}
				
	}
	
	
	public void save(Member member) {
		Optional<Member> findMember = memberMapper.findByName(member.getName());
		if(findMember.isPresent()) {
			throw new IllegalStateException("이미 존재하는 회원입니다");
		}
		memberMapper.save(member);
	}

	public void update(Member member) {
		memberMapper.update(member);
	}
	
	public void delete(Long id) {
		memberMapper.delete(id);
	}
	
	
	
	public Member findById(Long id) {
		return memberMapper.findById(id).orElseThrow(()->new NoSuchElementException("없는 회원입니다"));
	}
	
	
	public Member findByName(String name) {
		return memberMapper.findByName(name).orElseThrow(()->new NoSuchElementException("없는 회원입니다"));
	}
}
