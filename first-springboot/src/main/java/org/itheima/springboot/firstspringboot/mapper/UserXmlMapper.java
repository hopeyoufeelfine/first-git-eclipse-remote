package org.itheima.springboot.firstspringboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.itheima.springboot.firstspringboot.domain.User;

import java.util.List;

@Mapper
@Repository
public interface UserXmlMapper {

    public List<User> findAll2();
}
