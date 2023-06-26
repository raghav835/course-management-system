package com.cms.model;

public class Course {
	
	private String courseId;
	private String courseName;
	private Integer fees;
	private Integer duration;
	private String courseType;
	private float rating;
	
	public Course() {
		// Default constructor
	}

	public Course(String courseId, String courseName, Integer fees, Integer duration, String courseType, float rating) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
		this.duration = duration;
		this.courseType = courseType;
		this.rating = rating;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getFees() {
		return fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
}
