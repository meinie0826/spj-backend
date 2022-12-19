package com.example.demo1.service.impl.User.mycode;

import com.example.demo1.mapper.mycodemapper;
import com.example.demo1.service.User.mycode.getanswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class getanswerImpl implements getanswerService {

    @Autowired
    private mycodemapper mycodemapper;
    @Override
    public String getanswer() {
        return mycodemapper.selectOne(null).getAnswer();
    }
}
