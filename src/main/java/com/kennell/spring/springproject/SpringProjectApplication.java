package com.kennell.spring.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] { 124,  4, 6}, 6);
		System.out.println(result);
		
		SpringApplication.run(SpringProjectApplication.class, args);
	}

}
