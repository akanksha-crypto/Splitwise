package com.example.lld3.controllers;

import com.example.lld3.dtos.UserRequestDto;
import com.example.lld3.dtos.UserResponseDto;
import com.example.lld3.models.User;
import com.example.lld3.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    public UserResponseDto registerUser(UserRequestDto userRequestDto){
        System.out.println("Registering User");
        UserResponseDto userResponseDto = new UserResponseDto();
        User user = userService.registerUser(userRequestDto.getName(),
                userRequestDto.getPhonenumber(),
                userRequestDto.getPassword());
        userResponseDto.setId(user.getId());
        userResponseDto.setName(user.getName());
        return userResponseDto;
    }
}
