package Pegas.seminar8.example8_1.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggerAspect {
    
    @Around("execution(* Pegas.service.*.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object returnedByMethod = proceedingJoinPoint.proceed();
        return returnedByMethod;
    }
    @AfterReturning(value = "@annotation(Tolog)", returning = "returnedValue")
    public void log(Object returnedValue){
        System.out.println("Method executed and returned "+returnedValue);
    }
}
