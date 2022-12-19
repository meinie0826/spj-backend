package com.example.demo1.service.impl.User.account;

import com.example.demo1.pojo.User;
import com.example.demo1.service.User.account.LoginService;
import com.example.demo1.service.impl.utils.UserDetailsImpl;
import com.example.demo1.service.User.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public Map<String,String> gettoken(String username, String password){

        UsernamePasswordAuthenticationToken authenticationToken=
                new UsernamePasswordAuthenticationToken(username,password);
        //调用UserDetailsService认证
        Authentication authenticate = authenticationManager.authenticate(authenticationToken); //登录失败，自动处理

        //登录成功，把用户取出来
        UserDetailsImpl loginUser =(UserDetailsImpl) authenticate.getPrincipal();
        //用户取出来
        User user = loginUser.getUser();
        //根据用户唯一标识id创建一个token
        String jwt = JwtUtil.createJWT(user.getId().toString());


        Map<String,String> map= new HashMap<>();
        map.put("error_message","success");
        map.put("token",jwt);

        return map;
    }

}
