package pe.com.demo.servicesImpl;

import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.demo.dtos.DTOCourse;
import pe.com.demo.entities.Course;
import pe.com.demo.repositories.CourseRepository;
import pe.com.demo.services.CourseService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public Course createCourse(Course course) {
        Course newCourse = new Course(course.getVfName(),
                course.getVfCode(), course.getVfStartDate(),
                course.getVfDescription(), course.getVfType());
        return courseRepository.save(newCourse);
    }

    @Override
    public List<DTOCourse> getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        List<DTOCourse> dtoCourses = new ArrayList<>();

        for (Course course : courses) {
            DTOCourse dtoCourse = new DTOCourse(course.getVfId(),
                    course.getVfName(), course.getVfCode(),
                    course.getVfStartDate(), course.getVfDescription(),
                    course.getVfType());
            dtoCourses.add(dtoCourse);
        }
        return dtoCourses;
    }
}
