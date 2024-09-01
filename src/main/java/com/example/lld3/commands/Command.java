package com.example.lld3.commands;

public interface Command {
    boolean matches(String input);
    void execute(String input);
}
