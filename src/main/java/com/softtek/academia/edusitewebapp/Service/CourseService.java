package com.softtek.academia.edusitewebapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academia.edusitewebapp.Repository.CourseRepository;
import com.softtek.academia.edusitewebapp.entity.Course;

@Service
public class CourseService {
	
	private CourseRepository courseRepository;
	
	@Autowired
	public CourseService (CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}
	
	public List<Course> allCourses() {
		
		return (List<Course>)courseRepository.findAll();
	}
	

}
