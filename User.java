package com.example.study.model.entity;

//DB의 테이블 명과 동일하면됨. 주로 API 통신규격에서는 snake case, java에서는 camel case를 주로 사용하는 차이점.


import lombok.Data;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor     //모든 매개변수를 가지는 생성자 생성.
@Entity     //==table
//@Table(name = "user")   //클래스와 테이블의 이름이 같다면 생략가능
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "account") 이것도 실제 테이블의 컬럼명과 변수명이 동일 하기 때문에 생략 가능.
    private String account;

    private String email;

    //테이블에서는 phone_number이지만 JPA에서 자동으로 매칭 시켜줌.
    private String phoneNumber;

    private LocalDateTime createAt;

    private String createBy;

    private LocalDateTime updatedAt;

    private String updateBy;
}