package org.fkit.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Administrator;


public interface AdministratorMapper {
	@Select("select * from tb_administrator where loginname = #{loginname} and password = #{password}")
	Administrator findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
}
