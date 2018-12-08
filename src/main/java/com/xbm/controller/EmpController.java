package com.xbm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xbm.domain.Employees;
import com.xbm.service.EpmService;

@RequestMapping("/jsp/test")
@Controller
public class EmpController {
	@Autowired(required = true)
	private EpmService empService;

	@RequestMapping("/emp")
	public Map<String, String> getEmp(String id, HttpServletRequest request) {
		Map<String, String> map = new HashMap<String, String>();
		Employees emp = empService.getEmp(id);
		System.out.println("emp" + emp);
		String name = emp.getFIRST_NAME();
		String email = emp.getEMAIL();
		System.out.println(id + "--" + name);
		map.put("name", name);
		map.put("email", email);
		request.setAttribute("emp", emp);
		return map;
	}
}
