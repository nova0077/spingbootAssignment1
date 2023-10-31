package com.springrest.springrest.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	private CourseDao courseDao;
	
	public CourseServiceImpl() {
	}
	
	@Override
	public List<Courses> getCourses() {
		return courseDao.findAll();
	}
	
	@Override
	public Courses getCourse(long courseId) {
			return courseDao.getReferenceById(courseId);
	}

	@Override
	public Courses addCourse(Courses course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		Courses entity = courseDao.getReferenceById(parseLong);
		courseDao.delete(entity );
	}
}