package com.spring.music;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Entry {

	public static void main(String[] args) {
		System.out.println("Spring App - start");

		//ClassPathXmlApplicationContext myContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		
		//Guitarist aGuitarist = (Guitarist) myContext.getBean("guitarist");
		// or
		//IMusician  aGuitarist = (Guitarist) myContext.getBean("guitarist");
		// or
		//IMusician  aMusician = (IMusician) myContext.getBean("guitarist");
		
		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Scanner sc = new Scanner(System.in);
		IMusician aMusician = null;
		System.out.println("Which musician should play ? (P)ianist or (G)uitarist ?");
		String answer = sc.nextLine();
		
		if(answer.equalsIgnoreCase("G")) {
			// Pianist
			aMusician = (IMusician) myContext.getBean("guitarist");
		}
		else if(answer.equalsIgnoreCase("P")) {
			// Guitarist
			aMusician = (IMusician) myContext.getBean("pianist");
		}
		else {
			System.out.println("Wrong answer");
		}
		
		aMusician.play();

		// -------------------
		
		UserDao userDao = new UserDao();
		User user = new User("Tom", "Waits", 10000);
		userDao.addUser("tom", user);
		
		// -------------------
		
		myContext.close();
		
		System.out.println("Spring App - stop");
	}

}
