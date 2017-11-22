package com.quiz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.quiz.models.User;

public class DBConnection {

	public static void connect2DB() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "root");

			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static void createUser(User user) {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "root");
			String query = " insert into quiz.users (idusers,name,password)" + " values (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, user.getIdUser());
			stmt.setString(2, user.getNume());
			stmt.setString(3, user.getPassword());
			stmt.execute();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "root");
			String query = "SELECT * FROM quiz.users";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("idusers");
				String name = rs.getString("name");
				String password = rs.getString("password");
				users.add(new User(id, name, password));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;

	}
}
