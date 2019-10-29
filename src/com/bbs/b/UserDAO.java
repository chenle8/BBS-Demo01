package com.bbs.b;

import java.sql.*;

public class UserDAO {
	public boolean id(String u) {
		boolean flag = false;
		// SQL
		String sql = "select * from tUser where username='" + u + "'";
		// ÔËÐÐ
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;DatabaseName=BBSDB", "sa",
					"123456");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(sql);
			if (rs.next())
				flag = true;
			else
				flag = false;
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public String getPasswordByUsername(String u) {
		String str = "";
		String sql = "select * from tUser where username='" + u + "'";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;DatabaseName=BBSDB", "sa",
					"123456");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(sql);
			if (rs.next())
				str = rs.getString(2);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

	public boolean insertReg(String u, String p, String wen, String da) {
		boolean flag = false;
		String sql = "insert into tUser(username,passw,wen,da) values('" + u
				+ "','" + p + "','" + wen + "','" + da + "')";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;DatabaseName=BBSDB", "sa",
					"123456");
			Statement s = con.createStatement();
			s.execute(sql);
			con.close();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
}
