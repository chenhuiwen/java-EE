package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Good;
import org.fkit.domain.Order;

public interface OrderMapper {
	@Select(" select * from tb_order ")
	List<Order> findAll();
	@Delete("delete from tb_order where id=#{id}")
	int delete(Order order);
	@Select(" select * from tb_order where user_sn=#{user.id}")
	List<Order> findSome();
	@Insert("insert into tb_order(good_sn,user_sn,state)values(#{good_sn},#{user_sn},#{state})")
	int add(Order order);
	@Select("select * from tb_order where id=#{id}")
	Order selectOrder(@Param("id") int id);
	@Update("update tb_order set state=#{state} where id=#{id}")
	int updateCart(@Param("state") String state,@Param("id") int id);
}
