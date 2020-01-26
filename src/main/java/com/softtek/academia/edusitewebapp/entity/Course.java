package com.softtek.academia.edusitewebapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {

		
		@Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String course_name;
		private String instructor;
		
		public long getId() {
			return id;
		}
		
		public void setId(long id) {
			this.id = id;
		}
		
		public String getCourse_name() {
			return course_name;
		}
		
		public void setCourse_name(String course_name) {
			this.course_name = course_name;
		}
		
		public String getInstructor() {
			return instructor;
		}
		
		public void setInstructor(String instructor) {
			this.instructor = instructor;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", course_name=" + course_name + ", instructor=" + instructor + "]";
		}
		
		
		
	}

