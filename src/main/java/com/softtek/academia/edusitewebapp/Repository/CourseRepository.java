package com.softtek.academia.edusitewebapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softtek.academia.edusitewebapp.entity.Course;

@Repository
public interface CourseRepository  extends CrudRepository<Course, Long>{


}
