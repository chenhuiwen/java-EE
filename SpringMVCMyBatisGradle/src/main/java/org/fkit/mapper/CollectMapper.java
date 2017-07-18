package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Collect;

public interface CollectMapper {
	@Select("select * from tb_collect where user_sn=#{user_sn}")
	List<Collect> findAll(@Param("user_sn") int user_sn);
	@Select("select * from tb_collect where good_sn=#{good_sn} and user_sn=#{user_sn}")
	Collect findWithGoodAndUser(@Param("good_sn") int good_sn,@Param("user_sn") int user_sn);
	@Insert("insert into tb_collect(good_sn,user_sn,good_name,image) values(#{good_sn},#{user_sn},#{good_name},#{image})")
	void saveCollect(Collect collect);
	@Delete("delete from tb_collect where good_sn=#{good_sn} and user_sn=#{user_sn}")
	void removeCollect(@Param("good_sn") int good_sn,@Param("user_sn") int user_sn);
}
