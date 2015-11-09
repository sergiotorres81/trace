package org.trc.aop.logging;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class CustomLoggableHandler {

	private final static Logger logger = LoggerFactory.getLogger(CustomLoggableHandler.class);

	@Pointcut("within(@org.trc.aop.logging.Loggable *)")
	public void loggable() {
	}

	@Before("loggable() ")
	public void beforeLoggable(JoinPoint joinPoint) throws Throwable {
		String msg = "{Enter: " + joinPoint.getSignature().getDeclaringTypeName() + "."
				+ joinPoint.getSignature().getName() + "() with argument[s] = " + Arrays.toString(joinPoint.getArgs())
				+ "}";
		logger.debug(msg);

	}

}
