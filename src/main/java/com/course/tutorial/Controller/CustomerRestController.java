package com.course.tutorial.Controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.tutorial.Entity.Customer;
import com.course.tutorial.Repository.CustomerRepository;


@RestController
public class CustomerRestController {
	@Autowired
	CustomerRepository repository;
	@RequestMapping(value="/get")
	
	public @ResponseBody Customer getc()
	{
		Consumer<? super Customer> c = System.out::println;
		repository.findByLastName("Bauer").forEach(System.out::println);;
		 List<Customer> customers=repository.findByLastName("Bauer");
		
		 Customer customer= new Customer("aasd", "adsfadsf");
		 return customer;
	}
	
@RequestMapping( value="/put",produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String put()
	{
		
		return "abc";
	}

@RequestMapping(value="/add" ,method = RequestMethod.POST, consumes = "application/json")
public Customer addCustomer(@RequestBody Customer customer )
{
	try
	{
		System.out.println(customer);
	repository.save(customer);
	return customer;
	}catch (Exception e) {
		// TODO: handle exception
		return customer;
	}
	
	
}




}
