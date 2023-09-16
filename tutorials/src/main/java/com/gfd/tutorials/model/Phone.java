package com.gfd.tutorials.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="phones")
public class Phone {
	@Id
	@Column(
		name="phone_number"
	)
	private Integer number;
	
	@Column(
		name="nation_code",
		length=4,
		nullable=false
	)
	private String nation;
	
	@Column(
		name="type_of_number",
		length=16,
		nullable=false
	)
	private String typeOfNumber;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getNation() {
		return nation;
	}
	
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String getTypeOfNumber() {
		return typeOfNumber;
	}
	
	public void setTypeOfNumber(String typeOfNumber) {
		this.typeOfNumber = typeOfNumber;
	}
}
