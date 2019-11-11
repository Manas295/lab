package com.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.aop.data.*.*(..))")
	public void dataLayerExecution(){}
	
	@Pointcut("execution(* com.aop.business.*.*(..))")
	public void businessLayerExecution(){}
	
	@Pointcut("dataLayerExecution() && businessLayerExecution()")
	public void allLayerExecution(){}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao(){}
	
	@Pointcut("within(com.aop.data..*)")
	public void dataLayerExecutionWithWithin(){}

	@Pointcut("@annotation(com.aop.aspect.TrackTime)")
	public void trackTimeAnnotation(){}

}
