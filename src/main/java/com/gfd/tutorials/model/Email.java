package com.gfd.tutorials.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="emails")
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(
		name="email_address",
		length=32,
		nullable = false,
		unique = true
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
