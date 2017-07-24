package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Order;
import org.fkit.domain.User;

public interface OrderMapper {
	@Select(" select * from tb_order ")
	List<Order> findAll();
	@Delete("delete from tb_order where id=#{id}")
	int delete(Order order);
	@Select(" select * from tb_order where user_sn=#{user.id}")
	List<Order> findSome();
	@Insert("insert into tb_order(good_sn,user_sn,state,count)values(#{good_sn},#{user_sn},#{state},#{count})")
	int add(Order order);
	@Update("update tb_good set count=count-#{count},sale=sale+#{count} where id=#{good_sn}")
	int reduceGood(@Param("good_sn") int good_sn,@Param("count") int count);
	@Delete("delete from tb_cart where good_sn=#{good_sn}")
	int deleteCart(@Param("good_sn") int good_sn);
	@Select("select * from tb_order where id=#{id}")
	Order selectOrder(@Param("id") int id);
	@Update("update tb_order set state=#{state} where id=#{id}")
	int updateCart(@Param("state") String state,@Param("id") int id);
	@Select("select * from tb_user where id=#{user_sn}")
	User findUser(@Param("user_sn")int user_sn);
}
