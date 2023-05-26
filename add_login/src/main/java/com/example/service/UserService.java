package com.example.service;

import com.example.model.UserEntity;
import com.example.model.UserEntityDTO;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(UserEntityDTO userEntityDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setLogin(userEntityDTO.getLogin());
        userEntity.setPassword(userEntityDTO.getPassword());
        userRepository.save(userEntity);
    }

}
