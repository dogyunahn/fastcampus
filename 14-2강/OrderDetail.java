import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //order_detail 테이블과 연결
@Entity     //order_detail에 자동 연결
@ToString(exclude = {"user", "item"})       //상호참조 에러 방지
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private LocalDateTime orderAt;

    ////임시로 주석처리
    //private LocalDateTime orderAt;

    //OrderDetail 입장에선 N개의 구매목록, 1명의 User
    @ManyToOne
    //private Long userId;
    private User user;      //어노테이션을 통한 @ManyToOne을 사용시 Long -> User, userId->user 로 선언하면 Hibernate가 user_id로
                            //매칭시켜줌.

    //private Long itemId;

    //// 임시로 추가

    private LocalDateTime arrivalDate;

    private LocalDateTime createdAt;

    private String createdBy;

    private Long orderGroupId;

    private Long itemId;
    @ManyToOne
    //private Long itemId;
    private Item item;
}