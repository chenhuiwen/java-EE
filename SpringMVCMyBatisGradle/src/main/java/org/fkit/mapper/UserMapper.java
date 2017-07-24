package org.fkit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from tb_user where loginname = #{loginname} and password = #{password}")
	User findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	@Insert("insert into tb_user(loginname,password,username,phone,email)values(#{loginname},#{password},#{username},#{phone},#{email})")
	 int save(User user);
	@Update("update tb_user set password=#{new1} where loginname=#{loginname}")
	int findWithNew1(@Param("new1") String new1,@Param("loginname") String loginname);
	@Select("select * from tb_user where loginname=#{loginname} and Phone=#{phone}")
	User findWithLoginnameAndPhone(@Param("loginname")String loginname,
			@Param("phone") String phone);
	@Select("select * from tb_user where loginname=#{loginname} and email=#{email}")
	User findWithLoginnameAndEmail(@Param("loginname")String loginname,
			@Param("email") String email);
}

