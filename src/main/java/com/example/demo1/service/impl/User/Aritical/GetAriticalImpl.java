package com.example.demo1.service.impl.User.Aritical;

import com.example.demo1.mapper.AriticalMapper;
import com.example.demo1.pojo.Aritical;
import com.example.demo1.service.User.Aritical.GetAriticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAriticalImpl implements GetAriticalService {

    @Autowired
    private AriticalMapper ariticalMapper;

    @Override
    public List getaritical() {
        List<Aritical> ariticals = ariticalMapper.selectList(null);
        return ariticals;
    }
}
