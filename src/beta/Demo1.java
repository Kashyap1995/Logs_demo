package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import beta.Demo1;

public class Demo1 {

	private static Logger Log=	LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Log.debug("I am debugging");
		Log.info("object is present");

		Log.error("object is not present till");
		Log.fatal("this is fatal error");
	}
	
	}

