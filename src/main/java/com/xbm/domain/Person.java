package com.xbm.domain;

/**
 * @Description:
 * @Author:	陈子枢
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014-7-19
 */

public class Person {
	private Integer id;
	private String name;
	private Integer age;
	private String photoPath;			//图片路径
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
