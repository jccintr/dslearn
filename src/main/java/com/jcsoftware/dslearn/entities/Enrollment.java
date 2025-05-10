package com.jcsoftware.dslearn.entities;

import java.time.Instant;
import java.util.Objects;

import com.jcsoftware.dslearn.entities.pk.EnrollmentPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "enrollments")
public class Enrollment {
	
	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK();
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollMoment;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant refundMoment = null;
	
	private Boolean available = true;
	private Boolean onlyUpdate;
	
	public Enrollment() {
		
	}
	
	
	
	public Enrollment(Offer offer,User user, Instant enrollMoment, Instant refundMoment, Boolean available,Boolean onlyUpdate) {
		super();
		
		this.id.setOffer(offer);
		this.id.setUser(user);
		this.enrollMoment = enrollMoment;
		this.refundMoment = refundMoment;
		this.available = available;
		this.onlyUpdate = onlyUpdate;
	}



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
		Enrollment other = (Enrollment) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	

}
