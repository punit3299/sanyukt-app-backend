package com.sanyukt.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sanyukt_user_login")
public class UserLogin implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loginId;

	@NotNull
	@Email
	@Size(max = 100)
	@Column(length = 100)
	private String email;

	@NotNull
	@Size(max = 15)
	private long phone;

	@NotNull
	@Size(max = 50)
	@Column(length = 50)
	private String password;

	@OneToOne
	@JoinColumn(name = "userId", nullable = false)
	private User user;

	public long getLoginId() {
		return loginId;
	}

	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
