package com.donglin;

import com.donglin.dao.UserMapper;
import com.donglin.pojo.User;
import com.donglin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)  //以spring方式运行，产生ioc容器
@SpringBootTest  //SpringBoot框架和Junit整合
public class UserMapperTest {

    @Autowired
    UserService userService;

    @Test
    public void test1(){
        List<User> users = userService.findAll();
        System.out.println(users);
    }
}
