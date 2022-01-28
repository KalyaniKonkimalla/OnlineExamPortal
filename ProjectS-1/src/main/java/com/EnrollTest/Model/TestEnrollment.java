package com.EnrollTest.Model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="testenroll")
public class TestEnrollment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="test_id")
	private Integer testid;
	
	@Column(name="Course_Name",length=20)
	private String courseType;

	@Column(name="Status",length=3)
	private String statusCheck;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	@JsonBackReference
	private User user;

		
	public Integer getTestid() {
		return testid;
	}
	public void setTestid(Integer testid) {
		this.testid = testid;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
	public String getStatusCheck() {
		return statusCheck;
	}
	public void setStatusCheck(String statusCheck) {
		this.statusCheck = statusCheck;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "TestEnrollment [testid=" + testid + ", courseType=" + courseType + ", statusCheck=" + statusCheck + "", user=" + user + "]";
	}
	

}
