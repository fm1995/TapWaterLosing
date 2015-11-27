package com.sy.controller.yhgl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.entity.UsUser;

/**
 * 子类Controller 继承父类， 主要写具体某模块代码 可调用父类的所有Service
 * @author BarryLiu
 *
 */
@Controller
@RequestMapping("yk")
public class YKControllerImpl extends UsController {
	
	@RequestMapping("/test2")
	public String test2(){
		System.out.println("YKControllerImpl...:"+usUserService);
		usUserService.text();
		
		UsUser entity = new UsUser();
		entity.setAbc("sdfsdf");
		entity.setUserNo("1");
		int i = usUserService.insert(entity );
		System.out.println(i);
		return "/success.jsp";
	}
	@RequestMapping("/test3")
	public String test3(){
		System.out.println("YKControllerImpl...:"+usUserService);
		usUserService.text();
		
		UsUser entity = usUserService.selectByPrimaryKey("1");
		System.out.println(entity);
		
		return "/success.jsp";
	}
}
