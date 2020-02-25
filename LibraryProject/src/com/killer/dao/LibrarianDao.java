package com.killer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.killer.beans.LibrarianBean;

public class LibrarianDao {
	public int addLibrarian(LibrarianBean lb) {
		int status;
		Connection c = null;
		PreparedStatement ps = null;
		String query = "insert into Librarian (name,email,password,mobile) values(?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/eLibrary", "root", "Killer0786");
			ps = c.prepareStatement(query);
			ps.setString(1, lb.getName());
			ps.setString(2, lb.getEmail());
			ps.setString(3, lb.getPassword());
			ps.setLong(4, lb.getMobile());
			status = ps.executeUpdate();
			return status;
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
		return 0;
	}
	
	public ArrayList<LibrarianBean> viewLibrarian() {
		ArrayList<LibrarianBean> list = new ArrayList<LibrarianBean>();
		Connection c = null;
		Statement s = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/eLibrary", "root", "Killer0786");
			s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from librarian");
			while(rs.next()) {
				LibrarianBean lb = new LibrarianBean();
				lb.setId(rs.getInt(1));
				lb.setName(rs.getString(2));
				lb.setEmail(rs.getString(3));
				lb.setPassword(rs.getString(4));
				lb.setMobile(rs.getLong(5));
				list.add(lb);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (s != null) {
				try {
					s.close();
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
		return list;
	}

}
