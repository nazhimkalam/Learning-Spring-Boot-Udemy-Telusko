package com.nazhim.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(public * com.nazhim.demo.AlienController.getAliens())")
    public void logBefore()
    {
        LOGGER.info("getAliens method called from aspect...");
    }

    // By default the @After annotation will be called even after exceptions occurs.
    @After("execution(public * com.nazhim.demo.AlienController.getAliens())")
    public void logAfter()
    {
        LOGGER.info("getAliens method has Executed...");
    }
}

// Aspect Oriented Programming https://docs.spring.io/spring-framework/docs/4.3.15.RELEASE/spring-framework-reference/html/aop.html