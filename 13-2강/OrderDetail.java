package com.example.study.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //order_detail 테이블과 연결
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    ////임시로 주석처리
    //private LocalDateTime orderAt;

    //private Long userId;

    //private Long itemId;

    //// 임시로 추가

    private LocalDateTime arrivalDate;

    private LocalDateTime createdAt;

    private String createdBy;

    private Long orderGroupId;

    private Long itemId;
}