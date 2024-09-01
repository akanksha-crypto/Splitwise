package com.example.lld3.commands;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CommandExecutor {
    List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void removeCommand(Command command){
        commands.remove(command);
    }

    public void execute(String input){
        for (Command c : commands){
            if(c.matches(input)){
                c.execute(input);
            }
        }
    }
}
