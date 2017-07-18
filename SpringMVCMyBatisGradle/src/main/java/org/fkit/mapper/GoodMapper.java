package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Good;


public interface GoodMapper {
	@Select(" select * from tb_good ")
	List<Good> findAll();
	@Delete("delete from tb_good where id=#{id}")
	int delete(@Param("id") int id);
	@Insert("insert into tb_good(id,image,image2,image3,name,price,parent_category_sn,count,remark)values(#{id},#{image},#{image2},#{image3},#{name},#{price},#{parent_category_sn},#{count},#{remark})")
	int add(Good good);
	@Select(" select * from tb_good where parent_category_sn=#{parent_category_sn}")
	List<Good> findSome(@Param("parent_category_sn") String parent_category_sn);
	@Select("select * from tb_good where id=#{id}")
	Good selectGood(@Param("id") int id);
	@Update("update tb_good set count=count-1 where id=#{id}")
	int reduceGood(@Param("id") int id);
}
