package com.example.study.repository;

import com.example.study.model.entity.User;
import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


//    //QUERY 메소드라고도 함.
//    //SELECT * FROM user WHERE account = ? << test03, test04
//    Optional<User> findByAccount(String account);      //account에 매칭되는 것들을 기준으로 Select
//
//    Optional<User> findByEmail(String email);       //Email을 기준으로 select
//
//    //SELECT * FROM user WHERE account = ? AND email= ?
//    Optional<User> findByAccountAndEmail(String account, String email); //두가지값 AND 해서 SELECT

}