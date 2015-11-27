package com.sy.controller.yhgl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.service.yhgl.UsUserService;


/**
 * 为用户管理 的父Controller 主要是注入 可以操作的Service给子类用
 * @author BarryLiu
 *
 */
@Controller
@RequestMapping("user")
public class UsController {
	
	
	
	@Autowired
	protected UsUserService usUserService;
	
	@RequestMapping("/test")
	public String test(){
		System.out.println("usController:"+usUserService);
		usUserService.text();
		
		return "/success.jsp";
	}
}
