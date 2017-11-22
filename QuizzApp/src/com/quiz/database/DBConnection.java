package com.quiz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void connect2DB() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO quiz.users (idusers,name) " + "values(?,?)");
			stmt.setInt(1, 0);
			stmt.setString(2, "Tavi");
			stmt.execute();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
