package com.example.study.model.entity;

//엔티티는 DB의 테이블 명과 동일하면됨. 주로 API 통신규격에서는 snake case, java에서는 camel case를 주로 사용하는 차이점.


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor     //모든 매개변수를 가지는 생성자 생성.
@NoArgsConstructor      //기본 생성자.
@Entity     //==table
//@Table(name = "User")   //클래스와 테이블의 이름이 같다면 생략가능
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "account") 이것도 실제 테이블의 컬럼명과 변수명이 동일 하기 때문에 생략 가능.
    private String account;

    private String password;

    private String status;

    private String email;

    //테이블에서는 phone_number이지만 JPA에서 자동으로 매칭 시켜줌.
    private String phoneNumber;

    private LocalDateTime registerdAt;

    private LocalDateTime unregisterdAt;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;



//    //.LAZY = 지연 로딩 - 해당 테이블 하나만 FROM 해서 SELECT - 시간 적게 걸림.
//    //.EAGER = 즉시 로딩 - 연관된 테이블 전부 LEFT OUTER JOIN 해서 SELECT - 시간 많이 걸림.(보통 테이블 하나만 걸릴때 사용)
//    //User 테이블 입장에서는 1명의 유저, N개의 구매목록이므로 @OneToMany
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")   //mappedBy는 orderDetail에 있는 변수명(user)과 동일 해야함.
//                                                            //
//
//    private List<OrderDetail> orderDetailList;      //OrderDetail의 변수 user와 매칭 시킨다.
//                                                    //이렇게 user 클래스와 OrderDetail에서 1:N관계가 만들어진것.
}
