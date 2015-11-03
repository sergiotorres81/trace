package org.trc;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.trc.configuration.AspectConfig;
import org.trc.service.impl.DummyServiceImpl;

@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackageClasses = { AspectConfig.class, DummyServiceImpl.class })
public class TraceApplication {


}
