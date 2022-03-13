package org.itheima.springboot.springbootcondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootConditionApplication {
    //to test
    public static void main(String[] args) {
        //启动Springboot的应用，返回Spring的IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);
        //获取Bean
    /*
        Object redisTemplate = context.getBean("redisTemplate");
        System.out.println(redisTemplate);
    */
        Object user = context.getBean("user");
        System.out.println(user);
    }
}
