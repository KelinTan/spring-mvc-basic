package com.tan.self;

import com.baomidou.mybatisplus.plugins.Page;
import com.tan.self.mapper.UserMapper;
import com.tan.self.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Mr.tan
 * Date: 2017/12/24
 */
public class MybatisPlusTest {

    @Test
    public void testUser() {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-core.xml");

        UserMapper userMapper = context.getBean(UserMapper.class);

        User user = new User();
        user.setName("nihao");
        Integer id = userMapper.insert(user);

        System.out.println("id:"+id);

    }

    @Test
    public void testUserSelect() {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-core.xml");

        UserMapper userMapper = context.getBean(UserMapper.class);

        System.out.println(userMapper.selectById(1));

        Map<String,Object> params = new HashMap<>();
        params.put("name","3434");
        params.put("phone","3434");
        System.out.println(userMapper.selectByMap(params));
    }

    @Test
    public void testUserUpdate() {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-core.xml");

        UserMapper userMapper = context.getBean(UserMapper.class);

        User user = new User();
        user.setId(1);
        user.setName("jiagnshan");
        user.setPhone("ddfdf");
        System.out.println(userMapper.updateById(user));


        System.out.println(userMapper.selectCustom());
    }

    @Test
    public void testUserPage() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-core.xml");

        UserMapper userMapper = context.getBean(UserMapper.class);

        Page<User> page = new Page<>(4,2);
        page.setRecords(userMapper.selectUserList(page));
        System.out.println(page);
        System.out.println(page.getRecords());
    }

    @Test
    public void testUserList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-core.xml");

        UserMapper userMapper = context.getBean(UserMapper.class);

        System.out.println(userMapper.selectByMap(null));
    }
}
