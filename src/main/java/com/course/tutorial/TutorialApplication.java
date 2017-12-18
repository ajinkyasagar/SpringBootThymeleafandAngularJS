package com.course.tutorial;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.course.tutorial.Entity.Course;
import com.course.tutorial.Entity.Customer;
import com.course.tutorial.Entity.Topic;
import com.course.tutorial.Repository.CourseRepository;
import com.course.tutorial.Repository.CustomerRepository;
import com.course.tutorial.Repository.TopicRepository;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

			// fetch all customers
		
			for (Customer customer : repository.findAll()) {
				System.out.println(customer);
			}
			

			System.out.println("fetch an individual customer by ID");
			Customer customer = repository.findOne(1L);
			
			Consumer<? super Customer> c = System.out::println;
			System.out.println("fetch customers by last name");
			repository.findByLastName("Bauer").stream().forEach(c);
		
		};
	}
	
	@Bean CommandLineRunner demotopic(TopicRepository topicRepository) {
		return(args)->{
			topicRepository.save(new Topic("String", "Strings are Immutable", new Course("Java", "Learn Java")));
			
			for (Topic topic : topicRepository.findAll()) {
				System.out.println(topic);
			}
		};
	}
	
	@Bean CommandLineRunner democourse(CourseRepository courseRepository) {
		return(args)->{
			
			Course course= courseRepository.findOne(new Long(1));
			System.out.println(course);
			Set<Topic> topics = new HashSet<>();
			topics.add(new Topic("Excel","Sheet", course));
			course.setTopics(topics);
			
			courseRepository.save(course);
			
			
			
		};
	}
}
