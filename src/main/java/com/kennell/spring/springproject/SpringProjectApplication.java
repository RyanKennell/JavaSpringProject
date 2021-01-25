package com.kennell.spring.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.kennell.spring.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.kennell.spring")
public class SpringProjectApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringProjectApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] { 124,  4, 6}, 6);
		System.out.println(result);
		
		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);
	
		System.out.println(person1.getJdbcConnection());
		System.out.println(person2.getJdbcConnection());
	}

}
