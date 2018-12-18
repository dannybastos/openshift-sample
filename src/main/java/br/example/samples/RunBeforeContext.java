package br.example.samples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class RunBeforeContext implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	private Logger log = LoggerFactory.getLogger(getClass());
	
	public RunBeforeContext(ApplicationContext applicationContext) {
		this();
		this.applicationContext = applicationContext;
	}

	public RunBeforeContext() {
		log.info("=====================================");
		log.info("RunBeforeContext");
		log.info("=====================================");
		log.info("=====================================");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		log.info("setApplicationContext");
		this.applicationContext = applicationContext;
	}

}
