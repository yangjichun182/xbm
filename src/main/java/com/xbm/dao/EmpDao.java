package com.xbm.dao;

import com.xbm.domain.Employees;

public interface EmpDao {
	
	public void save(Employees emp);

	public Employees getEmp(String ID);
}
