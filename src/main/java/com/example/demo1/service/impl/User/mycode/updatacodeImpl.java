package com.example.demo1.service.impl.User.mycode;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo1.mapper.mycodemapper;
import com.example.demo1.pojo.mycode;
import com.example.demo1.service.User.mycode.updatecodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class updatacodeImpl implements updatecodeService {

    @Autowired
    private mycodemapper mycodemapper;

    @Override
    public void updata(Map<String, String> map) {
        String lang = map.get("lang");
        String code = map.get("code");
        String inputdata=map.get("inputdata");

        QueryWrapper<mycode> queryWrapper=new QueryWrapper<>();
        mycode mycode = new mycode();
        mycode.setCode(code);
        mycode.setInputdata(inputdata);
        mycode.setLang(lang);
        mycodemapper.update(mycode,null);
    }
}
