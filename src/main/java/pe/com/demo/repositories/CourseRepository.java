package pe.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.demo.entities.Course;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query(value = "SELECT * FROM vf_courses c WHERE c.vf_start_date  = '2023-05-05 00:00:00.000'", nativeQuery = true)
    List<Course> findCourseByDate();
}
