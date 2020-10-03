package com.nazhim.demo;

import org.aspectj.lang.annotation.*;
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

    // By default the @After annotation will be called even after exceptions occurs.(just like finally in exception handling)
    // Using the @AfterReturning annotation we only fire this log when the execution is successfully completed.
    @AfterReturning("execution(public * com.nazhim.demo.AlienController.getAliens())")
    public void logAfter()
    {
        LOGGER.info("getAliens method has Executed...");
    }

    // This fires when there is an error occurred during the execution of the getAliens() method
    @AfterThrowing("execution(public * com.nazhim.demo.AlienController.getAliens())")
    public void logException()
    {
        LOGGER.info("Issue occurred...");
    }
}

// Aspect Oriented Programming https://docs.spring.io/spring-framework/docs/4.3.15.RELEASE/spring-framework-reference/html/aop.html