package com.spring.music;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectInterceptor {
	@Before("execution(* com.spring.music.Pianist.play(..))")
	public void interceptToString() {
		System.out.println("Before - An instrument is playing");
	}
	
	@After("execution(* com.spring.music.Pianist.play(..))")
	public void interceptAfterToString() {
		System.out.println("After - An instrument is playing");
	}
}
