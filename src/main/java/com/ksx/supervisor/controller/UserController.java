package com.ksx.supervisor.controller;

import java.util.List;

import com.ksx.base.entity.BaseEntity;
import com.ksx.supervisor.entity.UserEntity;
import com.ksx.supervisor.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * 测试类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
		UserEntity userInfo = userService.getUserById(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "/user/showInfo";
	}
	
	@RequestMapping("/showInfos")
	public @ResponseBody Object showUserInfos(){
		//测试自己实现的方法
		//List<UserEntity> userInfos = userService.getUsers();
		//测试base基类实现的方法
		List<BaseEntity> userInfos = userService.queryAll();
		return userInfos;
	}
}
