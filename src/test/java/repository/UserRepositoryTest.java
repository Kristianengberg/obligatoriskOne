package repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void createFakeData() {
        UserRepository userRepository = new UserRepository();

        userRepository.createFakeData(5);

        System.out.println(userRepository.readAllUsers());
    }
}