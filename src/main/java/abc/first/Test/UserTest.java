package abc.first.Test;



import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import abc.first.Controllers.UserController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserTest {

    @Autowired
    UserController userController;

//    @Test
//    public void contextLoads() {
//        Assertions.assertThat(userController).isNot(null);
//    }
}