package com.softtek.academia.edusitewebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.academia.edusitewebapp.Service.CourseService;
import com.softtek.academia.edusitewebapp.entity.Course;

@RestController
public class RestCourseController {
	
	@Autowired 
	CourseService courseService;
	
	
	@GetMapping("/allCourses")
	public List<Course> listOfCourses() {
		return courseService.allCourses();
	}
}
