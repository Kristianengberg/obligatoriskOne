package com.example.demo.service;

import com.example.demo.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    @Override
    public String toString() {
        String returnString = "";

        for (User user : users ) {
            returnString += user.getUserName() + " ";
        }
        return returnString;
    }

    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public String showUsers(){
        return toString();
    }

}
