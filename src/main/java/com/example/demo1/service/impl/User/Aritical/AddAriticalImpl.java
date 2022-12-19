package com.example.demo1.service.impl.User.Aritical;

import com.example.demo1.mapper.AriticalMapper;
import com.example.demo1.pojo.Aritical;
import com.example.demo1.service.User.Aritical.AddAriticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AddAriticalImpl implements AddAriticalService {

    @Autowired
    private AriticalMapper ariticalMapper;

    @Override
    public void addaritical(Map<String, String> map) {

        String time=map.get("time");
        String title = map.get("title");
        String content = map.get("content");
        String author = map.get("author");

        Aritical aritical = new Aritical();
        aritical.setTitle(title);
        aritical.setContent(content);
        aritical.setAuthor(author);
        aritical.setTime(time);

        ariticalMapper.insert(aritical);
    }
}
