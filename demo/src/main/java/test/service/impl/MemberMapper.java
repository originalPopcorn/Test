package test.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import test.service.MberVO;

@Mapper
@Repository
public interface MemberMapper {
	
	List<MberVO> getMemberList();

	MberVO getMember(MberVO member);

	void insertMember(MberVO member);

	void deleteMember(MberVO member);
}
