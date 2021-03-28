import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.junit.jupiter.api.Assertions;


import java.time.LocalDateTime;
import java.util.Optional;
@@ -54,4 +59,34 @@ public void update(){
            userRepository.save(selectUser);
        });
    }

    //delete url에 삭제될 대상의 정보(id)가 들어오기 때문임
    //@DeleteMapping("/api/user")
    @Test
    //SQL의 TRAN 구문 역할과 같음. 끝나고 롤백됨.
    @Transactional
    public void delete(){
        Optional<User> user = userRepository.findById(3L);

        //반드시 데이터가 존재해야 하기 때문에(사전 검증 하는 역할)
        Assertions.assertTrue(user.isPresent());        //true

        user.ifPresent(selectUser->{
            //update와 동일하게 (삭제될)기준값을 바꾸면 안됨
            //selectUser.setId(3L);
            //delete는 반환형이 void
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(3L);

        Assertions.assertFalse(deleteUser.isPresent());     //false
//        if(deleteUser.isPresent()){
//            System.out.println("데이터 존재 :" + deleteUser.get());
//        }
//        else{
//            System.out.println("데이터 없음.");
//        }

    }
}