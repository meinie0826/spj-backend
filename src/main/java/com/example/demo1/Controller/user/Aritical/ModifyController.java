package com.example.demo1.Controller.user.Aritical;


import com.example.demo1.service.User.Aritical.ModifyAriticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ModifyController {

    @Autowired
    private ModifyAriticalService modifyAriticalService;

    @PostMapping("/user/account/modify")
    public void modifyaritical(@RequestParam Map<String,String> map){
        modifyAriticalService.modify(map);
    }
}
