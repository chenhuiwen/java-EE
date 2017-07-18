package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Evaluate;




public interface EvaluateMapper {
	@Select(" select * from tb_evaluate ")
	List<Evaluate> findAll();
	@Delete("delete from tb_evaluate where id=#{id}")
	int delete(@Param("id") int id);
	@Select(" select * from tb_evaluate where good_sn=#{good_sn}")
	List<Evaluate> findSome(@Param("good_sn") int good_sn);
	@Insert("insert into tb_evaluate(id,order_sn,good_sn,user_sn,text,image,point,point2,point3)values(#{id},#{order_sn},#{good_sn},#{user_sn},#{text},#{image},#{point},#{point2},#{point3})")
	int add(Evaluate evaluate);
	
}
