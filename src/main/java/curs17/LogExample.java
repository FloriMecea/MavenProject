package curs17;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogExample {
	
	public static Logger logger= LogManager.getLogger(LogExample.class);

	public static void main(String[] args) {
		LogExample obj=new LogExample();
		obj.printLog();

	}
	
	public void printLog() {//afiseaza in functie de ce este setat in fisierul de configurare log4j2
		logger.debug("This is a debug message");
		logger.info("This is a info message");
		logger.warn("This is a warn message");
		logger.error("This is a error message");
		logger.fatal("This is a fatal message");
	}

}
