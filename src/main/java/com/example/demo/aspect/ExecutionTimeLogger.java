package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExecutionTimeLogger {
    @Around("@annotation(com.example.demo.annotations.Timed)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long duration = System.currentTimeMillis() - start;

        String methodName = joinPoint.getSignature()
                .toShortString();
        System.out.println("In Aspect: \uD83D\uDC49\uD83C\uDFFE" + methodName + " executed in " + duration + " ms ✅ ");

        return result;
    }
}
