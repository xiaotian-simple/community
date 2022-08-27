package com.nowcoder.community.dao;

import com.nowcoder.community.CommunityApplication;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void selectById() {
        User user = userMapper.selectById(101);
        System.out.println(user);
        user = userMapper.selectByName("liubei");
        System.out.println(user);
        user = userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(user);
    }

    @Test
    void selectByName() {
        User user = userMapper.selectByName("test");
        System.out.println(user);
    }

    @Test
    void selectByEmail() {
        // User user = userMapper.selectByEmail("nowcoder101@sina.com");
        // System.out.println(user);
    }

    @Test
    void insertUser() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("123456");
        user.setSalt("abc");
        user.setEmail("test@test.com");
        user.setHeaderUrl("http://test.com/test.png");
        user.setCreateTime(new Date());

        Integer count = userMapper.insertUser(user);
        System.out.println(count);
        System.out.println(user.getId());
    }

    @Test
    void updateStatus() {
        Integer count = userMapper.updateStatus(150, 1);
        System.out.println(count);
    }

    @Test
    void updateHeaderUrl() {
        Integer count = userMapper.updateHeaderUrl(150, "test.com/test.png");
        System.out.println(count);
    }

    @Test
    void updatePassword() {
        Integer count = userMapper.updatePassword(150, "12345678");
        System.out.println(count);
    }
}