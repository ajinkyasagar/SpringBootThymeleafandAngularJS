package com.course.tutorial;

import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

import com.course.tutorial.Entity.Customer;
import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		
		Customer customer= new Customer("Sagar", "Thakare");
		Gson gson= new Gson();
		System.out.println(gson.toJson(customer));
		// TODO Auto-generated method stub

	}

}
