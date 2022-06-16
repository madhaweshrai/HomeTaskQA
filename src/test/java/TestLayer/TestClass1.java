package TestLayer;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;



public class TestClass1 {
	public static final Logger LOG= Logger.getLogger(TestClass1.class);
	@Test
	public void fun1()
	
	{
		LOG.info("start");
		System.out.println("Test ng example");
		LOG.error("error");
		LOG.fatal("fatel");
		LOG.info("end");
	}

}
