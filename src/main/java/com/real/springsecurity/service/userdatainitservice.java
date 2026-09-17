package com.real.springsecurity.service;


import com.real.springsecurity.Repository.userRepository;
import com.real.springsecurity.model.user;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.Converter;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Configuration

public class userdatainitservice {
    private final userRepository userRepository;

    @PostConstruct
    public void init(){
        List<user>users = new ArrayList<>();
        users.add(new user(1,"abc","123"));
        users.add(new user(2,"def","456"));
        users.add(new user(3,"ghi","789"));

        userRepository.saveAll(users);
    }
}
