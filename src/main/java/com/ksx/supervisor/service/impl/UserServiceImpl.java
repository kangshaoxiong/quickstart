package com.ksx.supervisor.service.impl;

import java.util.List;

import com.ksx.base.dao.IBaseDao;
import com.ksx.base.service.impl.BaseServiceImpl;
import com.ksx.supervisor.dao.IUserDao;
import com.ksx.supervisor.entity.UserEntity;
import com.ksx.supervisor.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试：用户业务类
 * @author kangshaoxiong
 *
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public UserEntity getUserById(int id) {
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public List<UserEntity> getUsers() {
		return userDao.selectAll();
	}

	@Override
	public int insert(UserEntity userInfo) {
		
		int result = userDao.insert(userInfo);
		
		System.out.println(result);
		return result;
	}
	
	@Override
	protected IBaseDao getDao() {
		// TODO Auto-generated method stub
		return userDao;
	}

}
