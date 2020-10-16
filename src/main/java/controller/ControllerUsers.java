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

@RestController
public class ControllerUsers {

    private UserRepository userRepository;

    @Autowired
    public ControllerUsers(){
        userRepository = new UserRepository();
    }

    @GetMapping("/")
    public String index(Model model){
        System.out.println("in the first method");
        model.addAttribute("user", userRepository.readAllUsers());
        return "index";
    }

    @GetMapping("/createUser")
    public String createUser(Model model){
        model.addAttribute("createUser", new Users());
        return "/";
    }

    @PostMapping("/createUser")
    public String createUser(@ModelAttribute Users user){
        userRepository.createUser(user);
        return "/";
    }
}
