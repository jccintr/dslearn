package com.jcsoftware.dslearn.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.jcsoftware.dslearn.entities.pk.EnrollmentPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "enrollment")
	private List<Deliver> deliveries = new ArrayList<>();
	
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
	
	public User getStudent() {
		return this.id.getUser();
	}
	
	public void setStudent(User student) {
		this.id.setUser(student);
	}
	
	public Offer getOffer() {
		return this.id.getOffer();
	}
	
	public void setOffer(Offer offer) {
		this.id.setOffer(offer);
	}
	
	public Instant getEnrollMoment() {
		return enrollMoment;
	}



	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}



	public Instant getRefundMoment() {
		return refundMoment;
	}



	public void setRefundMoment(Instant refundMoment) {
		this.refundMoment = refundMoment;
	}



	public Boolean getAvailable() {
		return available;
	}



	public void setAvailable(Boolean available) {
		this.available = available;
	}



	public Boolean getOnlyUpdate() {
		return onlyUpdate;
	}



	public void setOnlyUpdate(Boolean onlyUpdate) {
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
