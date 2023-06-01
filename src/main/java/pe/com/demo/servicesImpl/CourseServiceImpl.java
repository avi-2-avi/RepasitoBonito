package pe.com.demo.servicesImpl;

import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.demo.entities.Course;
import pe.com.demo.repositories.CourseRepository;
import pe.com.demo.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public Course createCourse(Course course) {
        Course newCourse = new Course(course.getVfName(),
                course.getVfCode(), course.getVfStartDate(),
                course.getVfDescription(), course.getVfType());
        Course savedCourse = courseRepository.save(newCourse);
        return savedCourse;
    }
}
