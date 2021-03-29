package com.example.study.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;

@Data
    @GeneratedValue(strategy = GenerationType.IDENTITY)
public class Item{
    private Long id;

   
    private String content;

    private String title;

    private Long partnerId;

    private String name;

    private Integer price;
 
    private String content;

    //1:N
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "item")
    private List<OrderDetail> orderDetailList;
   

}
