package com.sy.controller.sfgl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.dto.Report;
import com.sy.entity.UsUser;

/**
 * 数据报表
 * @author BarryLiu
 *
 */
@Controller
@RequestMapping("/report")
public class ReportController extends PyController{
	
	
	//用户预收情况报表
	@RequestMapping("/yushou")
	public String yushou(Report report,HttpServletRequest request){
		Map<String, Object> map = usUserService.yushou(report.getPage(), report.getRows(), report.getUserMoney());
		request.setAttribute("map", map);
		return "/sy/page/pay_reportBalance.jsp";
	}
	
	//各类用水统计总表
	@RequestMapping("/tongji")
	public String tongji(){
		System.out.println("tongji...");
		
		
		return "/sy/page/pay_reportWaterType.jsp";
	}
	
}
