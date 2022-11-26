package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	private static Logger Log=	LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Log.debug("I have clicked on button");
		Log.info("Button is displayed");

		Log.error("Button is not displayed");
		Log.error("Button is not working");

		Log.fatal("Button is missing");
	}
				
	

}
