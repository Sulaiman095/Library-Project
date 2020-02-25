package com.killer.beans;

import java.io.Serializable;

public class LibrarianBean implements Serializable {

	private static final long serialVersionUID = 6278479056483583044L;
	private int id;
	private String name;
	private String email;
	private String password;
	private long mobile;

	public LibrarianBean() {

	}

	public LibrarianBean(String name, String email, String password, long mobile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "LibrarianBean [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + "]";
	}

}
