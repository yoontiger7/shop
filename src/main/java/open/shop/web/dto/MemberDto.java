package open.shop.web.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import open.shop.domain.member.Member;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class MemberDto {
	
	private Long id;
	private String name;
	private String password;
	private String address;
	private Integer phone;
	
	public MemberDto(Member member) {
		
		this.id = member.getId();
		this.name = member.getName();
		this.password = member.getPassword();
		this.address = member.getAddress();
		this.phone = member.getPhone();
	}
	
	

}
