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
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "contents", uniqueConstraints = {@UniqueConstraint(columnNames = {"type_of_content", "content_description"})})
public class Content {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Integer id;
	
	@Column(name = "type_of_content", length=64, nullable = false)
	private String typeOfContent;
	
	@Column(name = "content_description", length = 256, nullable = false)
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "tutorial_id")
	private Tutorial tutorial;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeOfContent() {
		return typeOfContent;
	}

	public void setTypeOfContent(String typeOfContent) {
		this.typeOfContent = typeOfContent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Tutorial getTutorial() {
		return tutorial;
	}

	public void setTutorial(Tutorial tutorial) {
		this.tutorial = tutorial;
	}
}
