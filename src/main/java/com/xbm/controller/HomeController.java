package com.xbm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author:	
 * @Company:	com.pactera
 * @CreateDate:	2014-7-19
 */
@Controller
public class HomeController {

	@RequestMapping("/home")				//http://localhost/springmvcnew/home.action
	public String gohome(HttpServletRequest request){
		System.out.println(request.getRequestURL());
		return "index";				
	}
}
