package com.gfd.tutorials.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="urls")
public class Url {
	@Id
	@Column(
		name="url_address"
	)
	private String url;
	
	@Column(
		name="url_description" //web, youtube, instagram, ...
	)
	private String urlDescription;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUrlDescription() {
		return urlDescription;
	}
	
	public void setUrlDescription(String urlDescription) {
		this.urlDescription = urlDescription;
	}
}
