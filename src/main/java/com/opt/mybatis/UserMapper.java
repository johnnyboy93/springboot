package com.opt.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

@Mapper
public interface UserMapper {
	
	@Select("select * from users")
	List<Users> findAll();
	
	@Insert("Insert into users (name, salary) values (#{name}, #{salary})")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType = Integer.class)
	void insert(Users users);
	
}
