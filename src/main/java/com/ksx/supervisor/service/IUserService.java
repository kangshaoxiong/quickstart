package com.ksx.supervisor.service;

import java.util.List;
import com.ksx.supervisor.entity.UserEntity;

/**
 * 测试：用户业务类接口
 * @author pc
 *
 */
public interface IUserService{

	UserEntity getUserById(int id);
	
	List<UserEntity> getUsers();
	
	int insert(UserEntity userInfo);
}
