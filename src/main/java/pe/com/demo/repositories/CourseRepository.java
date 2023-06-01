package pe.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.demo.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
