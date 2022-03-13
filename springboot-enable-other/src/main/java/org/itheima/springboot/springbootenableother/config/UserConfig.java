package org.itheima.springboot.springbootenableother.config;

import org.itheima.springboot.springbootenableother.domain.Role;
import org.itheima.springboot.springbootenableother.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    public User user() {
        return new User();
    }

    @Bean
    public Role role() {
        return new Role();
    }
}
