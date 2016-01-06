package com.ksx.supervisor.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ksx.base.entity.BaseEntity;
import com.ksx.supervisor.entity.UserEntity;
import com.ksx.supervisor.service.IUserService;
import com.ksx.util.StringUtil;

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
	
	/**
	 * 测试基本的查询方法
	 * @return
	 */
	@RequestMapping("/showInfos")
	public @ResponseBody Object showUserInfos(){
		//测试自己实现的方法
		List<UserEntity> userInfos = userService.getUsers();
		//测试base基类实现的方法
		//List<BaseEntity> userInfos = userService.queryAll();
		return userInfos;
	}
	
	/**
	 * 测试分页方法
	 */
	@RequestMapping("/showPage")
	public String showUserPage(HttpServletRequest request, ModelMap mode, HttpServletResponse response){
		String pageNo = request.getParameter("pageNo");
		if (!StringUtil.isInteger(pageNo)) {
			pageNo = "1";
		}
		return "/user/showPage";
	}
}
