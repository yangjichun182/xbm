package com.xbm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(path = "/pactera")
public class HelloWorldControler {

	@RequestMapping(path = "/a")
	public String testHello(){
		return "/parameter";
	}
}
