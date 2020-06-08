package com.spring.music;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectInterceptorUserDao {
	@Before("execution(* com.spring.music.UserDao.addUser(..))")
	public void interceptBeforeAddUser() {
		// to be replaced with Log4j
		System.out.println("Before - A user will be added");
	}
}
