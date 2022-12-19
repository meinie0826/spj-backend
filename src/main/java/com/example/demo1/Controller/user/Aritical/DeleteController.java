package com.example.demo1.Controller.user.Aritical;


import com.example.demo1.service.User.Aritical.DeleteAriticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DeleteController {

    @Autowired
    private DeleteAriticalService deleteAriticalService;

    @GetMapping("/user/account/delete")
    public void delete(@RequestParam Map<String,String> map)
    {
        deleteAriticalService.deleteartical(map);
    }
}
