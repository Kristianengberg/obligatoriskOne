package controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RestController;
import repository.UserRepository;

@RestController
public class ControllerUsers {

    private UserRepository userRepository = new UserRepository();

}
