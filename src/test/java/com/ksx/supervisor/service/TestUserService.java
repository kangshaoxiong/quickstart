package com.ksx.supervisor.service;

import java.util.List;

import com.ksx.supervisor.entity.UserEntity;
import com.ksx.supervisor.service.IUserService;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

/**
 * 创建时间：2015-1-27 下午10:45:38
 * 
 * @author andy
 * @version 2.2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestUserService {

	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);

	@Autowired
	private IUserService userService;

	/*
	 * @Test public void testQueryById() { ApplicationContext ac = new
	 * ClassPathXmlApplicationContext( new String[] { "spring.xml",
	 * "spring-mybatis.xml" }); UserService userService = (UserService)
	 * ac.getBean("userService"); UserInfo userInfo =
	 * userService.getUserById(1); System.out.println(userInfo.getUname()); }
	 */

	@Test
	public void testQueryById1() {
		UserEntity userInfo = userService.getUserById(1);
		LOGGER.info(JSON.toJSON(userInfo));
	}

	@Test
	public void testQueryAll() {
		List<UserEntity> userInfos = userService.getUsers();
		LOGGER.info(JSON.toJSON(userInfos));
	}

	@Test
	public void testInsert() {
		UserEntity userInfo = new UserEntity();
		userInfo.setUname("xiaoming");
		userInfo.setUnumber(4);
		int result = userService.insert(userInfo);
		System.out.println(result);
	}
}
