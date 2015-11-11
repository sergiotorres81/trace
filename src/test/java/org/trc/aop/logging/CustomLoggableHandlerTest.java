package org.trc.aop.logging;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.trc.TraceApplication;
import org.trc.service.DummyService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TraceApplication.class)
public class CustomLoggableHandlerTest {

	@Autowired
	private DummyService dummyService;

	@Before
	public void setUp() {
	}

	@Test
	public void testLoggableAspectWithoutTheInterface() throws Exception {
		dummyService.helloWorld("CustomLoggableHandlerTest");
	}

	@Test
	public void testLoggableAspectThrowException() {
		try {
			dummyService.helloExceptions();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

}
