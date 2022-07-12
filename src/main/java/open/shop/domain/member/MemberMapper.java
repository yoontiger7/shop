package open.shop.domain.member;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	
	void save(Member member);
	void update(Member member);
	void delete(Long id);
	
	
	Optional<Member> findById(Long id);
	Optional<Member> findByName(String name);
	List<Member> findAll();
	
	
}
