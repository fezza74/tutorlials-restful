package com.gfd.tutorials.model;

import java.time.LocalDateTime;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
	name = "tutorials",
	uniqueConstraints = {@UniqueConstraint(columnNames = {
			"tutorial_title",
			"tutorial_subtitle"
	})}
)
public class Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Integer id;
	
	@Column(name = "tutorial_theme", length = 255, nullable = false)
	private String tutorialTheme;
	
	@Column(name = "tutorial_title", length = 255, nullable = false)
	private String tutorialTitle;
	
	@Column(name = "tutorial_subtitle", length = 255, nullable = false)
	private String tutorialSubtitle;
	
	@Column(name = "tutorial_createdAt", nullable = false)
	private LocalDateTime createdAt;
	
	@OneToMany(mappedBy = "tutorial", fetch = FetchType.LAZY)
	private Set<Content> contents;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "url_id")
	private Url url;

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user =user;
	}
	
	public Url getUrl() {
		return url;
	}

	public void setUrl(Url url) {
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTutorialTheme() {
		return tutorialTheme;
	}

	public void setTutorialTheme(String name) {
		this.tutorialTheme = name;
	}

	public String getTutorialTitle() {
		return tutorialTitle;
	}

	public void setTutorialTitle(String title) {
		this.tutorialTitle = title;
	}

	public String getTutorialSubtitle() {
		return tutorialSubtitle;
	}

	public void setTutorialSubtitle(String subtitle) {
		this.tutorialSubtitle = subtitle;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}
}
