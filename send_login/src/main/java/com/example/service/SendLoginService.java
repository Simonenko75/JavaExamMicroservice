package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendLoginService {

    @Autowired
    private AddLoginApi addLoginApi;

    public void addUser(UserEntityDTO userEntityDTO) {
        addLoginApi.addUserToDB(userEntityDTO);
    }

}
