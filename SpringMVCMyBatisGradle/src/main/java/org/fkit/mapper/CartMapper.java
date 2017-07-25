package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Cart;



public interface CartMapper {
	@Select(" select * from tb_cart ")
	List<Cart> findAll();
	@Select(" select * from tb_cart where user_sn=#{user_sn}")
	List<Cart> findUserAll(@Param("user_sn") String user_sn);
	@Delete("delete from tb_cart where id=#{id}")
	int delete(Cart cart);
	@Insert("insert into tb_cart(good_sn,image,name,price,user_sn,count)values(#{id},#{image},#{name},#{price},#{user_sn},#{count})")
	int save(Cart cart);
	@Delete("delete from tb_cart")
	int deleteAll(Cart cart);
	@Select(" select * from tb_cart where good_sn=#{good_sn}")
	Cart findWithId(@Param("good_sn") String good_sn);
	@Update("update tb_cart set count=count+1 where good_sn=#{good_sn}")
	int addCart(@Param("good_sn") String good_sn);
	@Update("update tb_cart set count=count-1 where good_sn=#{good_sn}")
	int reduceCart(@Param("good_sn") String good_sn);
}
