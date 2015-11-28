package com.sy.controller.sfgl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.service.yhgl.UsUserService;

/**
 * 收费管理
 * @author BarryLiu
 *
 */
@Controller
public class PyController {
	
	@Autowired
	protected UsUserService usUserService;
	
}
