package com.example.demo1.service.impl.User.Aritical;

import com.example.demo1.mapper.AriticalMapper;
import com.example.demo1.pojo.Aritical;
import com.example.demo1.service.User.Aritical.ModifyAriticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ModifyAriticalImpl implements ModifyAriticalService {

    @Autowired
    private AriticalMapper ariticalMapper;

    @Override
    public void modify(Map<String, String> map) {

        int id=Integer.parseInt(map.get("id"));
        String time=map.get("time");
        String title=map.get("title");
        String content=map.get("content");

        Aritical aritical = new Aritical(id,"mzy",time,title,content);
        ariticalMapper.updateById(aritical);
    }
}
