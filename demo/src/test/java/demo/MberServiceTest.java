package demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import test.service.MberVO;
import test.service.impl.MemberMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class MberServiceTest {
	
	@Autowired
	MemberMapper mapper;
	
	@Test
	public void getMemberList() {
		List<MberVO> list = mapper.getMemberList();
		for (MberVO member : list) {
			System.out.println("=====>"+member);
		}
	}
}
