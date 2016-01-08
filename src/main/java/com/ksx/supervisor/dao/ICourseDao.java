package com.ksx.supervisor.dao;

import com.ksx.supervisor.entity.CourseEntity;

public interface ICourseDao{
    int deleteByPrimaryKey(Integer id);

    int insert(CourseEntity record);

    int insertSelective(CourseEntity record);

    CourseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseEntity record);

    int updateByPrimaryKey(CourseEntity record);
}