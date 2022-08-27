package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(Integer userId, Integer offset, Integer limit);

    //参数起别名，如果只有一个参数，并且在if中使用（动态sql），则必须加别名
    Integer selectDiscussPostRows(@Param("userId") Integer userId);




}
