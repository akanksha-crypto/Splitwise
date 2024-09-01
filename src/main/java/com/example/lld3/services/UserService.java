package com.example.lld3.services;

import com.example.lld3.models.User;
import com.example.lld3.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User registerUser(String name, String phonenumber, String password){
        System.out.println("UserService : Registering User");
        User user = new User();
        user.setName(name);
        user.setPhonenumber(phonenumber);
        user.setPassword(password);
        return userRepository.save(user);
    }
}
