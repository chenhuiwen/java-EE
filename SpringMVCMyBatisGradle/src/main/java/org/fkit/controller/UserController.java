package org.fkit.controller;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.mysql.fabric.Response;



/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		
		User user = userService.login(loginname, password);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到main请求
			mv.setView(new RedirectView("./main"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	@RequestMapping(value="/save")
	public ModelAndView save(
			@ModelAttribute User user,
			ModelAndView mv,
			 HttpSession session){
		int count=userService.addUser(user);
		mv.addObject("message", "注册成功，请登陆!");
		mv.setViewName("loginForm");
	return mv;
	
	
}
	
	@RequestMapping(value="/find")
	 public ModelAndView find(
			 String loginname,String phone,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.findUser(loginname, phone);
		if(user != null){
			session.setAttribute("user", user);
			mv.setViewName("showpasswordForm");
		}else{
			mv.addObject("message", "用户登录名不存在!");
			mv.setViewName("findForm");
		}
		return mv;
	}
	@RequestMapping(value="/update")
	 public ModelAndView update(
			 String new1,String loginname,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		 userService.updateUser(new1, loginname);
			mv.addObject("message", "修改成功!");
			mv.setViewName("loginForm");
		
		return mv;
	}
}
