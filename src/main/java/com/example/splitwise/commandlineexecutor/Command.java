package com.example.splitwise.commandlineexecutor;

public interface Command {

    boolean match(String command);
    void execute(String input);
}
