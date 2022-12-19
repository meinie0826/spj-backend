package com.example.demo1.service.impl.User.account;

import com.example.demo1.pojo.User;
import com.example.demo1.service.impl.utils.UserDetailsImpl;
import com.example.demo1.service.User.account.InfoService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InfoServiceImpl implements InfoService {

    @Override
    public Map<String, String> getInfo() {
        UsernamePasswordAuthenticationToken authentication =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        //用户取出来
        UserDetailsImpl loginUser = (UserDetailsImpl) authentication.getPrincipal();
        //
        User user = loginUser.getUser();

        Map<String, String> map = new HashMap<>();
        map.put("error_message", "success");
        map.put("id", user.getId().toString());
        map.put("username", user.getUsername());
        map.put("photo", user.getHeadphoto());
        return map;
    }
}
