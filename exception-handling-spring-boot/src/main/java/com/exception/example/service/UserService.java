package com.exception.example.service;

import com.exception.example.client.InstaWebToolsAppClient;
import com.exception.example.common.UserStatus;
import com.exception.example.config.GlobalErrorCode;
import com.exception.example.config.application.UserAlreadyRegisteredException;
import com.exception.example.dto.User;
import com.exception.example.entity.UserEntity;
import com.exception.example.repository.UserRepository;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {


    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private  InstaWebToolsAppClient instaWebToolsAppClient;


    public void createUser(User user){
        Optional<UserEntity> userEntity = userRepository.findUserEntitiesByUserName(user.getUserName());
        if(userEntity.isPresent()){
            throw  new UserAlreadyRegisteredException("User is already registered ", GlobalErrorCode.ERROR_USER_ALREADY_REGISTERED);

        }else{
            UserEntity ue= new UserEntity();
            ue.setUserName(user.getUserName());
            ue.setPassword(UUID.randomUUID().toString());
            ue.setUserStatus(UserStatus.PENDING);
            userRepository.save(ue);
        }

    }

    public User readUserByUserName(String userName){
        Optional<UserEntity> userEntityByName = userRepository.findUserEntitiesByUserName(userName);
        User user= new User();
        BeanUtils.copyProperties(userEntityByName.get(),user);
        return  user;
    }

    public String readAirline(String airlinesId){
        return instaWebToolsAppClient.readAirlinesById(airlinesId);
    }
}

