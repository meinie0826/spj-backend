package com.example.demo1.Controller.user.Aritical;


import com.example.demo1.service.User.Aritical.GetAriticalService;
import com.example.demo1.service.impl.User.Aritical.GetAriticalImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAriticalController {

    @Autowired
    private GetAriticalService getAriticalService;

    @GetMapping("/user/aritical/getaritical")
    public List getaritical(){return getAriticalService.getaritical();}
}
