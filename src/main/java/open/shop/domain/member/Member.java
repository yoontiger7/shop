package open.shop.domain.member;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import open.shop.web.dto.MemberDto;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
	
	private Long id;
	private String name;
	private String password;
	private String address;
	private Integer phone;
	
	
	public Member(Long id, String name, String password, String address, Integer phone) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}

	public Member(String name, String password, String address, Integer phone) {
		this.name = name;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}
	
	public static Member createMember(MemberDto memberDto) {
		return new Member(memberDto.getName(), memberDto.getPassword(), 
				memberDto.getAddress(), memberDto.getPhone());
	}
	
	public static Member updateMember(Long id, MemberDto memberDto) {
		return new Member(id, memberDto.getName(), memberDto.getPassword(), 
				memberDto.getAddress(), memberDto.getPhone());
	}

}
