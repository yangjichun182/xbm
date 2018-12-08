package com.xbm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xbm.dao.EmpDao;
import com.xbm.domain.Employees;

@Service("empService")
public class EpmService {
	
	@Autowired(required=true)
	private EmpDao empDao;

	public void save(Employees emp) {
		empDao.save(emp);
	}

	public Employees getEmp(String id) {
		Employees emp = empDao.getEmp(id);
		return emp;
	}
}
