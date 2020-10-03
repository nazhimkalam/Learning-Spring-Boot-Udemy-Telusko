package com.nazhim.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{
    @Before("execution(public * com.nazhim.demo.AlienController.getAliens())")
    public void log()
    {
        System.out.println("getAliens method called from aspect...");
    }
}

// Aspect Oriented Programming https://docs.spring.io/spring-framework/docs/4.3.15.RELEASE/spring-framework-reference/html/aop.html