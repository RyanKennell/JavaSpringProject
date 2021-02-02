package com.kennell.spring.springproject;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.kennell.spring.cdi.CdiBusiness;
import com.kennell.spring.properties.ExternalService;
import com.kennell.spring.scope.PersonDAO;

@Configuration
@ComponentScan("com.kennell.spring")
@PropertySource("classpath:app.properties")
public class SpringProjectApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringProjectApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		ExternalService service = applicationContext.getBean(ExternalService.class);
		System.out.println(service.returnServiceURL());
		
		int result = binarySearch.binarySearch(new int[] { 124,  4, 6}, 6);
		System.out.println(result);
		
		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);
	
		System.out.println(person1.getJdbcConnection());
		System.out.println(person2.getJdbcConnection());
	
		CdiBusiness cdiBusiness = applicationContext.getBean(CdiBusiness.class);
		
		System.out.println(cdiBusiness + " " + cdiBusiness.getCdidao());
	
		applicationContext.close();
	}

}
