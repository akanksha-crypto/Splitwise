package com.example.lld3.commands;

import com.example.lld3.controllers.UserController;
import com.example.lld3.dtos.UserRequestDto;
import com.example.lld3.dtos.UserResponseDto;

import java.util.List;

public class RegisterUserCommand implements Command{
    private UserController userController;
    public RegisterUserCommand(UserController userController){
        this.userController = userController;
    }
    @Override
    public boolean matches(String input) {
        System.out.println("Check if input matches RegisterUserCommand");
        List<String> words = List.of(input.split(" "));
        return words.size() == 4 && words.get(0).equals(CommandKeyWords.REGISTER_USER);
    }

    @Override
    public void execute(String input) {
        System.out.println("Executing RegisterUserCommand");
        List<String> words = List.of(input.split(" "));
        String name = words.get(1);
        String phonenumber = words.get(2);
        String password = words.get(3);
        System.out.println("Registering user: "+name+" with phoneNum: "+phonenumber+" and password: "+password);

        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setName(name);
        userRequestDto.setPhonenumber(phonenumber);
        userRequestDto.setPassword(password);
        UserResponseDto userResponseDto = userController.registerUser(userRequestDto);
        System.out.println(userResponseDto);
    }
}
