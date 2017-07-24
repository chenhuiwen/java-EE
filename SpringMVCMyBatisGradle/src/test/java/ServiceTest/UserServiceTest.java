package ServiceTest;


import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import BaseTest.BaseJunitTest;

public class UserServiceTest extends BaseJunitTest{
	 @Autowired
	 private UserService userService;
	@Test
	public void testLogin() {
		
		User user=userService.login("123", "234");
		System.out.println(user);
	}
	@Test
	public void testAddUser(){
		User user=new User();
		user.setEmail("email");
		user.setId(2);
		user.setLoginname("loginname");
		user.setPassword("password");
		user.setPhone("12345678900");
		user.setUsername("username");
		userService.addUser(user);
		System.out.println(user);
	}
	@Test
	public void testUpdateUser(){
		String new1="1";
		String loginname="123";
		userService.updateUser(new1,loginname);
	}
	@Test
	public void testFind(){
		User user=userService.find("123", "445352949@qq.com");
		System.out.println(user);
		
		
	}
}
