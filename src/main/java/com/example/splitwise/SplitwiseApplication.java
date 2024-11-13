package com.example.splitwise;

import com.example.splitwise.commandlineexecutor.Command;
import com.example.splitwise.commandlineexecutor.RegisterUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SplitwiseApplication {
	static List<Command> commands = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(SplitwiseApplication.class, args);
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("enter command");
			String input = sc.nextLine();
			String action = input.split(" ")[0];
			for(Command command : commands){
				if(command.match(action)){
					command.execute(input);
				}
			}
		}
	}

	static void initializeAllCommands() {
		commands.add(new RegisterUser());
	}

}
