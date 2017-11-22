package com.quiz.main;

import java.util.ArrayList;

import com.quiz.database.DBConnection;
import com.quiz.models.User;

public class MainClass {

	public static void main(String[] args) {
		
		//DBConnection.createUser(new User(1,"Seby","seby"));
		
		ArrayList<User> users=DBConnection.getUsers();
		
		for(User user:users)
		{
			System.out.println(user.toString());
		}

	}

}
