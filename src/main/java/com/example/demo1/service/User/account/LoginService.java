package com.example.demo1.service.User.account;

import java.util.HashMap;
import java.util.Map;

public interface LoginService {
    public Map<String,String> gettoken(String username, String password);
}
