package com.ksx.supervisor.dao;

import com.ksx.supervisor.entity.CourseUserEntity;

public interface ICourseUserDao{
    int deleteByPrimaryKey(Integer id);

    int insert(CourseUserEntity record);

    int insertSelective(CourseUserEntity record);

    CourseUserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseUserEntity record);

    int updateByPrimaryKey(CourseUserEntity record);
}