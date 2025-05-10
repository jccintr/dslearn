package com.jcsoftware.dslearn.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "contents")
public class Content extends Lesson {
	
	private String textContent;
	private String videoUri;
	
	public Content(Long id, String title, Integer position, Section section, String textContent, String videoUri) {
		super(id, title, position, section);
		this.textContent = textContent;
		this.videoUri = videoUri;
	}
	

}
