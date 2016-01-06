package com.ksx.supervisor.entity;

import java.util.List;

import com.ksx.base.entity.BaseEntity;

public class UserEntity extends BaseEntity{
	private Integer id;

	private String uname;

	private Integer unumber;

	private List<CourseEntity> courseEntitys;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname == null ? null : uname.trim();
	}

	public Integer getUnumber() {
		return unumber;
	}

	public void setUnumber(Integer unumber) {
		this.unumber = unumber;
	}

	public List<CourseEntity> getCourseEntitys() {
		return courseEntitys;
	}

	public void setCourseEntitys(List<CourseEntity> courseEntitys) {
		this.courseEntitys = courseEntitys;
	}

}