package com.gfd.tutorials.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="urls")
public class Url {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Integer id;

	@Column(
		name="url_path",
		nullable = false,
		unique = true
	)
	private String urlPath;
	
	@Column(
		name="type_of_url" //website, youtube, instagram, ...
	)
	private String typeOfUrl;

	@OneToOne(mappedBy = "url")
	@JsonIgnore
	private Tutorial tutorial;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Tutorial getTutorial() {
		return tutorial;
	}

	public void setTutorial(Tutorial tutorial) {
		this.tutorial = tutorial;
	}

	public String getUrlPath() {
		return urlPath;
	}
	
	public void setUrlPath(String url) {
		this.urlPath = url;
	}
	
	public String getTypeOfUrl() {
		return typeOfUrl;
	}
	
	public void setTypeOfUrl(String urlDescription) {
		this.typeOfUrl = urlDescription;
	}
}
