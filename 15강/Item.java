import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@@ -19,14 +20,35 @@
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 
    private String name;

    private Integer price;
 
    private String content;

    //1:N
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "item")
    private List<OrderDetail> orderDetailList;
   

}