package org.trc.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.trc.TraceApplication;
import org.trc.service.DummyService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TraceApplication.class)
public class DummyServiceTest {

	private final static Logger logger = LoggerFactory.getLogger(DummyServiceTest.class);

	@Autowired
	private DummyService dummyService;

	@Test
	public void testLoggableAspect() throws Exception {
		logger.debug("Starting test..");
		dummyService.helloWorld("Sergio");
		dummyService.getIntegerTest();
	}

	@Test
	public void testLoggableAspectWithoutTheInterface() throws Exception {
		DummyServiceImpl dummy = new DummyServiceImpl();
		dummy.setIntegerTest(9);
		dummy.getIntegerTest();
	}

}
