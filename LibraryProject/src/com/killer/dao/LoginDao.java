package com.killer.dao;

import java.sql.*;

public class LoginDao {

	public String validateAdmin(String mail, String pass) {
		Connection c = null;
		PreparedStatement ps = null;
		String query = "select * from admin where email=? and password=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/eLibrary", "root", "Killer0786");
			ps = c.prepareStatement(query);
			ps.setString(1, mail);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String password = rs.getString("password");
				if (password.equals(pass)) {
					String name = rs.getString(1);
					return name;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
