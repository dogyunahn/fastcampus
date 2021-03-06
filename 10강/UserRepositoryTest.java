import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

public void create(){
        User newUser = userRepository.save(user);
        System.out.println("User : " + newUser);
    }
        //두 번쨰
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
        
            selectUser.setAccount("pppp");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method");

            userRepository.save(selectUser);
        });
    }
}
