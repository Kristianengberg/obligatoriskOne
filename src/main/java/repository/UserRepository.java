package repository;

import model.Users;

import java.util.ArrayList;

public class UserRepository {

    private ArrayList<Users> database;

    public UserRepository(){
        database = new ArrayList<>();
        createFakeData(5);
    }

    public void createUser(Users user){
        database.add(user);
    }

    public ArrayList<Users> readAllUsers(){
        return this.database;
    }

    public void createFakeData(int i){
        for (int j = 0; j < i; j++) {
            Users user = new Users("kristian " + i);
            database.add(user);
            System.out.println(user.getUserName());
        }
    }

}
