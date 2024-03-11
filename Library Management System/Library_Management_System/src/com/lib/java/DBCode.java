package com.lib.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCode {
	String dburl="jdbc:mysql://localhost:3306/library";
	String dbid="root";
	String dbpass="bala";
	public Connection con;
	
	public DBCode() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(dburl, dbid, dbpass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
