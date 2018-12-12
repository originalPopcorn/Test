package test.service;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Alias("mberVO")
@Getter @Setter
public class MberVO {
	
	private int idx;
	private String id;
	private String name;
	private String pw;
	
}
