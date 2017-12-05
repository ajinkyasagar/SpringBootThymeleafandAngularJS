package com.course.tutorial.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.course.tutorial.Entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);

}
