package org.trc.service;

public interface DummyService {

	/**
	 * Says hello to the world
	 * 
	 * @param greeting
	 * @return
	 * @throws Exception
	 */
	String helloWorld(String person) throws Exception;

	/**
	 * Just to test method
	 * 
	 * @return
	 */
	Integer getIntegerTest();

	String helloExceptions() throws Exception;
}
