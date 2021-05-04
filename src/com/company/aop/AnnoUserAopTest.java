package com.company.aop;

import com.company.config.AopConfig;
import com.company.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoUserAopTest {
    @Test
    public void test() {
        ApplicationContext act = new AnnotationConfigApplicationContext(AopConfig.class);
        User user = act.getBean("user", User.class);
        user.getName();
    }
}
