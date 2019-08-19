package pointcut;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect  
public class TrackOperation{  
 /*   @Pointcut("execution(* Operation.*(..))")  
    public void k(){}//pointcut name  
    
    @Pointcut("execution(* Operation.display())")  
    public void l(){}//pointcut name
 
    
      
    @Before("k()")//applying pointcut on before advice
*/    
	public void myadvice(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("additional concern");  
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }

/*    @Around("l()")
    public void myadvice2(ProceedingJoinPoint jp) throws Throwable//it is advice (before advice)  
    {  
        System.out.println("Advise before msg method");
        jp.proceed();
        System.err.println("Advise after msg method");
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }
    */
}  