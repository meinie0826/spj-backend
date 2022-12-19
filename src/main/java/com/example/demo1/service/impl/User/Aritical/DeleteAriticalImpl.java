package com.example.demo1.service.impl.User.Aritical;

import com.example.demo1.mapper.AriticalMapper;
import com.example.demo1.service.User.Aritical.DeleteAriticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DeleteAriticalImpl implements DeleteAriticalService {

    @Autowired
    private AriticalMapper ariticalMapper;

    @Override
    public void deleteartical(Map<String, String> map) {

        int id=Integer.parseInt(map.get("id"));

        ariticalMapper.deleteById(id);
    }
}
