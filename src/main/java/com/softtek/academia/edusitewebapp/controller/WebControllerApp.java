package com.softtek.academia.edusitewebapp.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.softtek.academia.edusitewebapp.Service.CourseService;
import com.softtek.academia.edusitewebapp.entity.Course;


@Controller
public class WebControllerApp implements WebMvcConfigurer {

	@Autowired
	CourseService courseService;
	
	@Override
	public void addViewControllers (ViewControllerRegistry registry) {
		registry.addViewController("/blog-post").setViewName("blog-post");
		registry.addViewController("/blog").setViewName("blog");
		registry.addViewController("/contact").setViewName("contact");
		registry.addViewController("/").setViewName("index");
	}
		
	@GetMapping("/home")
	public String goHome(Model model) {
		
		List<Course> course= courseService.allCourses();
		model.addAttribute("courses" , course);
		
		return "index";
	}
	
	
	
	
	
	
}
