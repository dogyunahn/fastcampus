import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data

@NoArgsConstructor  //기본 생성자
@AllArgsConstructor //모든 생성자
@Entity     //order_detail에 자동 연결

//@ToString(exclude = {"user", "item"})       //상호참조 에러 방지
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    private LocalDateTime arrivalDate;

    private Integer quantity;

    private LocalDateTime orderAt;

    private BigDecimal totalPrice;

    private LocalDateTime registerdAt;

    private LocalDateTime unregisterdAt;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    
    private String updatedBy;


  
//    //OrderDetail 입장에선 N개의 구매목록, 1명의 User
//    @ManyToOne
//    //private Long userId;
//    private User user;      //어노테이션을 통한 @ManyToOne을 사용시 Long -> User, userId->user 로 선언하면 Hibernate가 user_id로
//                            //매칭시켜줌.
//
//
//    @ManyToOne
//    //private Long itemId;
//    private Item item;
}