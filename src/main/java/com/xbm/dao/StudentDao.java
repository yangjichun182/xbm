package com.xbm.dao;

import com.xbm.domain.Student;

public interface StudentDao {
	
	public void save(Student student);

	public Student getStudent(String ID);
}
