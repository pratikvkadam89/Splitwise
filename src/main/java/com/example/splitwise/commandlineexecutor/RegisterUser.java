package com.example.splitwise.commandlineexecutor;

public class RegisterUser implements Command{
    @Override
    public boolean match(String command) {
        if(command.equalsIgnoreCase("registerUser")) return true;
        return false;
    }

    @Override
    public void execute(String input) {
        //TODO
    }
}
