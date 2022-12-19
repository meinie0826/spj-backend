package com.example.demo1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo1.mapper.Usermapper;
import com.example.demo1.pojo.User;
import com.example.demo1.service.impl.utils.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceimpl implements UserDetailsService {

    @Autowired
    private Usermapper usermapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.eq("username",username);
        User user = usermapper.selectOne(queryWrapper);
        if(user==null){
            throw new RuntimeException("not found");
        }


        return new UserDetailsImpl(user);
    }
}
