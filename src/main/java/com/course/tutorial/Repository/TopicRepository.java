package com.course.tutorial.Repository;

import org.springframework.data.repository.CrudRepository;

import com.course.tutorial.Entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, Long>{

}
