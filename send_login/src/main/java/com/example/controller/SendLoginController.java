package com.example.controller;

import com.example.service.SendLoginService;
import com.example.service.UserEntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class SendLoginController {

    @Autowired
    private SendLoginService sendLoginService;

    @PostMapping("/add")
    public void login(@RequestBody UserEntityDTO userEntityDTO) {
        sendLoginService.addUser(userEntityDTO);
    }

}
