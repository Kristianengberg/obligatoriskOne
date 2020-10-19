package com.example.demo;

import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService = new UserService();

    @PostMapping("api/addUser")
    public ResponseEntity addUser(@RequestBody AJAXrequest req){
        System.out.println("api/addUser er kaldet med " + req.username);
        User user = new User();
        user.setUserName(req.username);
        userService.addUser(user);
        return ResponseEntity.ok(userService.showUsers());
    }

}
