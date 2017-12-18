/**
 * 
 */
package com.course.tutorial.Repository;

import org.springframework.data.repository.CrudRepository;

import com.course.tutorial.Entity.Course;

/**
 * @author admin
 *
 */
public interface CourseRepository extends CrudRepository<Course, Long> {

}
