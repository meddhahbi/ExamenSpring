package com.exemple.Mohameddhahbi.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;


@Component
@Aspect
@Slf4j
public class LoggingAspect {

	
/*	@Before("execution(* tn.esprit.controllers.*.ajouter*(..))")
	public void logMethodEntry(JoinPoint joinPoint) {
		
		String name = joinPoint.getSignature().getName();
		
		log.info("Début Exécution :" + name );
	}*/
	
	
	@After("execution(void com.exemple.Mohameddhahbi.Controller.*.*(..))")
	public void logMethodExit(JoinPoint joinPoint) {
		
		String name = joinPoint.getSignature().getName();
		
		log.info(name);
	}
	
	
	
}
