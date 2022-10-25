package abc.first.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import abc.first.controller.UserController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import abc.first.Domain.UserDomain;
import abc.first.Service.UserServices;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class RestControllerTest {

    @MockBean
    UserServices  userServices;
    @Autowired
    MockMvc mockMvc;
    @Test
    public void testfindAll() throws Exception {
        UserDomain userDomain = new UserDomain(123l, "piyush", "1234567890", "Bellandur", "additional Details Test");
        List<UserDomain> users = Arrays.asList(userDomain);
        Mockito.when(userServices.findAll()).thenReturn(users);
        mockMvc.perform(get("http://localhost:9090/user/all"))
                .andExpect(status().isOk());

    }

//    @Test
//    public void testSaveUser() throws Exception {
//
//    }

}


