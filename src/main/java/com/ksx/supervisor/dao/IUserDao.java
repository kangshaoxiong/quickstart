package com.ksx.supervisor.dao;

import java.util.List;

import com.ksx.supervisor.entity.UserEntity;

public interface IUserDao{
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
    
    List<UserEntity> selectAll();
}