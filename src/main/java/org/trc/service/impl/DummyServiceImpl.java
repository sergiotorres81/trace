package org.trc.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.trc.aop.logging.Loggable;
import org.trc.service.DummyService;

@Service
@Loggable
public class DummyServiceImpl implements DummyService {

	private final static Logger logger = LoggerFactory.getLogger(DummyServiceImpl.class);
	private Integer integerTest = 1;

	/**
	 * @return the integerTest
	 */
	public Integer getIntegerTest() {
		return integerTest;
	}

	/**
	 * @param integerTest
	 *            the integerTest to set
	 */
	public void setIntegerTest(Integer integerTest) {
		this.integerTest = integerTest;
	}

	public String helloWorld(String person) throws Exception {
		logger.debug("Greetings " + person);
		return "Hi !!! " + person;
	}

	public String helloExceptions() throws Exception {
		throw new Exception("this is for testing purposes...");
	}

}
