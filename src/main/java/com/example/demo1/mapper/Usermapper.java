package com.example.demo1.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo1.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Usermapper extends BaseMapper<User> {
}
