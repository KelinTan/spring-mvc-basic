package com.tan.self;

import com.tan.self.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: Mr.tan
 * Date:  2018/01/08 12:30
 * Description: userMapper测试
 */
public class UserMapperTest extends BaseSpringTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void select() {

        System.out.println(userMapper.selectById(1));
    }
}
