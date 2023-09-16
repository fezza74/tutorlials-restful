package com.gfd.tutorials.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="emails")
public class Email {
	@Id
	@Column(
		name="email_address",
		length=32
	)
	private String emailAddress;
	
	@Column(
		name="tipology"
	)
	private String tipeOfEmail;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String address) {
		this.emailAddress = address;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getTipeOfEmail() {
		return tipeOfEmail;
	}
	
	public void setTipeOfEmail(String tipeOfEmail) {
		this.tipeOfEmail = tipeOfEmail;
	}
}
