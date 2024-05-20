package Pegas.seminar8.example8_1.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggerAspect {
    
    @Around("execution(* Pegas.service.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object returnedByMethod = proceedingJoinPoint.proceed();
        return returnedByMethod;
    } 
}
