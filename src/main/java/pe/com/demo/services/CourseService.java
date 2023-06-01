package pe.com.demo.services;

import pe.com.demo.dtos.DTOCourse;
import pe.com.demo.entities.Course;

import java.util.List;

public interface CourseService {
    public Course createCourse(Course course);
    public List<DTOCourse> getAllCourses();
}
