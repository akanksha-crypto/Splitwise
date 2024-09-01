package com.example.lld3;

import com.example.lld3.commands.CommandExecutor;
import com.example.lld3.commands.RegisterUserCommand;
import com.example.lld3.controllers.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Lld3Application implements CommandLineRunner  {
    private CommandExecutor commandExecutor;
    public Lld3Application(CommandExecutor commandExecutor){
        this.commandExecutor = commandExecutor;
    }
    @Autowired
    private UserController userController;
    public static void main(String[] args) {
        SpringApplication.run(Lld3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        commandExecutor.addCommand(new RegisterUserCommand(userController));
        while (true) {
            System.out.println("Enter Command");
            String input = sc.nextLine();
            commandExecutor.execute(input);
        }
    }
}
