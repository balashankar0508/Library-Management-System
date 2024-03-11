package com.lib.java;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manage extends DBCode() {
	int liblogin(String luser,String lpass) throws SQLException {
		String q = "select * from liblogin where luser = ? and lpass = ?";
		PreparedStatement pst = con.prepareStatement(q);
		pst.setString(1, luser);
		pst.setString(1, lpass);
		ResultSet rs = pst.executeQuery();
		int res= 0;
		if(rs.next()) {
			res=1;
		}
		return res;
	
}

