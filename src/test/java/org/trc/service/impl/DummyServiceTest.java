package org.trc.service.impl;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
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
	public void testHelloWorld() throws Exception {
		logger.debug("Starting testHelloWorld..");
		 MatcherAssert.assertThat(
				 dummyService.helloWorld("DummyServiceTest"),
		            Matchers.containsString("Hi !!! " + "DummyServiceTest")
		        );
	}
	
	@Test
	public void testGetIntegerTest() throws Exception{
		logger.debug("Starting testGetIntegerTest..");
		MatcherAssert.assertThat(dummyService.getIntegerTest(), Matchers.lessThanOrEqualTo(1));
	}


}
