package com.mindgate.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	public Logger() {
		System.out.println("Logger Object Is Created !!");
	}

	@Before("execution(public String showWelcomePage())")
	public void printMessage() {
		System.out.println("Logger Called");
	}
}
