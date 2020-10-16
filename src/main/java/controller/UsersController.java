package controller;

import model.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    private UserRepository userRepository = new UserRepository();

}
