package com.example.study.model.entity;

//DB의 테이블 명과 동일하면됨. 주로 API 통신규격에서는 snake case, java에서는 camel case를 주로 사용하는 차이점.
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
//@Table(name = "user")   //클래스와 테이블의 이름이 같다면 생략가능
//@Table(name = "User")   //클래스와 테이블의 이름이 같다면 생략가능
public class User {

    @Id
@@ -27,11 +30,21 @@
    //테이블에서는 phone_number이지만 JPA에서 자동으로 매칭 시켜줌.
    private String phoneNumber;

    private LocalDateTime createAt;
    private LocalDateTime createdAt;

    private String createBy;
    private String createdBy;

    private LocalDateTime updatedAt;

    private String updateBy;
    private String updatedBy;




    //User 테이블 입장에서는 1명의 유저, N개의 구매목록이므로 @OneToMany
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")   //mappedBy는 orderDetail에 있는 변수명(user)과 동일 해야함.
                                                            //

    private List<OrderDetail> orderDetailList;      //OrderDetail의 변수 user와 매칭 시킨다.
                                                    //이렇게 user 클래스와 OrderDetail에서 1:N관계가 만들어진것.
}