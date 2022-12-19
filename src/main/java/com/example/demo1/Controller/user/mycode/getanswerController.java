package com.example.demo1.Controller.user.mycode;

import com.example.demo1.service.User.mycode.getanswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getanswerController {

    @Autowired
    private getanswerService getanswerService;

    @GetMapping("/user/getanswer")
    public String getanswer(){
        return getanswerService.getanswer();
    }
}
