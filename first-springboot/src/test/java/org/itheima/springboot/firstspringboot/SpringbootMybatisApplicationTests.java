package org.itheima.springboot.firstspringboot;

import org.itheima.springboot.firstspringboot.domain.User;
import org.itheima.springboot.firstspringboot.mapper.UserMapper;
import org.itheima.springboot.firstspringboot.mapper.UserXmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.junit.Test;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserXmlMapper userXmlMapper;

    @Test
    public void findAllTest() {
        List<User> list = userMapper.findAll();
        System.out.println(list);
    }

    @Test
    public void findAll2Test() {
        List<User> list2 = userXmlMapper.findAll2();
        System.out.println(list2);
    }
}
