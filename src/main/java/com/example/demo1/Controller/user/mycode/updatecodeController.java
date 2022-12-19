package com.example.demo1.Controller.user.mycode;


import com.example.demo1.service.User.mycode.updatecodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class updatecodeController {

    @Autowired
    private updatecodeService updatecodeService;

    @GetMapping("/user/updatecode")
    public void updatecode(@RequestParam Map<String,String> map){
        updatecodeService.updata(map);
    }
}
