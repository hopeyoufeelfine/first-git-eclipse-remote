package org.itheima.springboot.firstspringboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.itheima.springboot.firstspringboot.domain.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from nmbondtest.t_user")
    public List<User> findAll();
}
