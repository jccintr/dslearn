package com.jcsoftware.dslearn.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "topics")
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;

	@Column(columnDefinition = "TEXT")
	private String body;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant moment;
	
	@ManyToOne
	@JoinColumn(name = "lesson_id")
	private Lesson lesson;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	private User author;
	
	@ManyToOne
	@JoinColumn(name="offer_id")
	private Offer offer;
	
	@ManyToOne
	@JoinColumn(name = "reply_id")
	private Reply answer;
	
	@ManyToMany
	@JoinTable(name = "topic_likes",
		joinColumns = @JoinColumn(name = "topic_id"),
		inverseJoinColumns = @JoinColumn(name = "user_id"))	
	private Set<User> likes = new HashSet<>();
	
	@OneToMany(mappedBy = "topic")
	private List<Reply> replies = new ArrayList<>();

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topic other = (Topic) obj;
		return Objects.equals(id, other.id);
	}

	
}
