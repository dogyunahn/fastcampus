package com.example.study.repository;


import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends StudyApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        User user = new User();
        //user.setId(1L);      //Auto increasement 이기 때문에 할필요 없음.
        user.setAccount("TestUser03");
        user.setEmail("user3@gmail.com");
        user.setPhoneNumber("010-3333-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser3");

        User newUser = userRepository.save(user);
        System.out.println("User : " + newUser);
    }
}