package test;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sy.mappdao.UsUserMapper;

public class Test1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("spring-mvccore.xml");
		
		UsUserMapper mapper = (UsUserMapper) cxt.getBean("usUserMapper");
		System.out.println(mapper);
		int page=2,rows=5;
		mapper.selectYSListCount((page - 1) * rows, rows, 200);
	}
}
