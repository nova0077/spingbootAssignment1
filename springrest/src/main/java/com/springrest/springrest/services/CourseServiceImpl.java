package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	List<Courses> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses(145, "Java Core Course", "This course containes basic of Java"));
		list.add(new Courses(1, "SpringBoot Course", "Create rest API using SpringBoot"));
	}
	
	@Override
	public List<Courses> getCourses() {
		
		return list;
	}
	
	@Override
	public Courses getCourse(long courseId) {
		
		Courses c=null;
		for(Courses course:list)
		{
			if(course.getId() == courseId)
			{
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}
}
