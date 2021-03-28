import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

@@ -26,4 +28,30 @@ public void create(){
        User newUser = userRepository.save(user);
        System.out.println("User : " + newUser);
    }

    @Test
    public User read(@RequestParam Long id){

        Optional<User> user = userRepository.findById(2L);
        //Optional<User> user = userRepository.findById(id);
        user.ifPresent(selectUser -> {
            System.out.println("user : " + selectUser);
            System.out.println("email : " + selectUser.getEmail());
        });

        return user.get();
    }

    @Test
    public void update(){
        Optional<User> user = userRepository.findById(2L);
        user.ifPresent(selectUser -> {
            //셋팅한 값들만 update 해준다.(세팅하지 않았고 기존에 있던 값에는 덮어쓰기 하지 않음)
            selectUser.setAccount("pppp");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method");

            userRepository.save(selectUser);
        });
    }
}