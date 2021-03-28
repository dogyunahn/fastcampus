package com.example.study.repository;


import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.OrderDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sun.jvm.hotspot.utilities.Assert;

import java.time.LocalDateTime;


@Repository
public class OrderDetailRepositoryTest extends StudyApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrderAt(LocalDateTime.now());
        //어떤 아이템
        orderDetail.setItemId(7L);

        orderDetail.setStatus("status1");
        orderDetail.setArrivalDate(LocalDateTime.now());
        orderDetail.setCreatedAt(LocalDateTime.now());
        orderDetail.setCreatedBy("orderdetail1");
        //ordergroup 테이블에 group id 1이 있어야 sql 실행됨.
        orderDetail.setOrderGroupId(1L);
        //item테이블의 id==1 데이터가 있어야 sql 실행됨.
        orderDetail.setItemId(1L);

        //어떤 누가?
        orderDetail.setUserId(1L);

        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        //Assertions.assertNotNull(newOrderDetail);

        Assertions.assertNotNull(newOrderDetail);
    }

}