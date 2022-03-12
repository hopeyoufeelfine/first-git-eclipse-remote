package org.itheima.springboot.springbootcondition.config;

import org.itheima.springboot.springbootcondition.condition.ConditionOnClass;
import org.itheima.springboot.springbootcondition.domain.ConditionUser;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    //@Conditional(ClassCondition.class)
    //@ConditionOnClass("redis.clients.jedis.Jedis")
    @ConditionalOnProperty(name = "itcast", havingValue = "itheima")
    public ConditionUser user() {
        return new ConditionUser();
    }
}
