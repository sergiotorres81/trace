package org.trc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.trc.aop.logging.CustomLoggableHandler;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

	@Bean
	public CustomLoggableHandler loggingAspect() {
		return new CustomLoggableHandler();
	}

}
