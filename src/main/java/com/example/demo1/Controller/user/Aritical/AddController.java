package com.example.demo1.Controller.user.Aritical;

import com.example.demo1.service.User.Aritical.AddAriticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AddController {

    @Autowired
    private AddAriticalService addAriticalService;

    @PostMapping("/user/account/add")
    public void addaritical(@RequestParam Map<String,String> map){
        addAriticalService.addaritical(map);
    }
}
