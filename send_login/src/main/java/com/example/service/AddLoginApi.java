package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient(name = "Users", url = "localhost:8888")
public interface AddLoginApi {

    @PostMapping("/users/add")
    @ResponseBody void addUserToDB(@RequestBody UserEntityDTO userEntityDTO);

}
