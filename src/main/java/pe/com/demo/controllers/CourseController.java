package pe.com.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.demo.dtos.DTOCourse;
import pe.com.demo.entities.Course;
import pe.com.demo.services.CourseService;

@RestController
@RequestMapping("/vidal")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping("/courses")
    public ResponseEntity<DTOCourse> createCourse(@RequestBody Course course) {
        Course newCourse = courseService.createCourse(course);
        DTOCourse dtoCourse = new DTOCourse(newCourse.getVfId(),
                newCourse.getVfName(), newCourse.getVfCode(),
                newCourse.getVfStartDate(), newCourse.getVfDescription(),
                newCourse.getVfType());
        return new ResponseEntity<DTOCourse>(dtoCourse, HttpStatus.CREATED);
    }
}
