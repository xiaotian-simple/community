package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DiscussPostMapperTest {
    @Resource
    private DiscussPostMapper discussPostMapper;

    @Test
    void selectDiscussPosts() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for (int i = 0; i < list.size(); i++) {
            DiscussPost discussPost = list.get(i);
            System.out.println(discussPost);
        }
    }

    @Test
    void selectDiscussPostRows() {
        Integer rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }
}