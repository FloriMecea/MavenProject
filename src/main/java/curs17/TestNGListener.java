package curs17;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++");
		Log.info("+ Strat test case : "+ result.getMethod().getMethodName()+ "++++++++++++");
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("Start time :" + timeStamp);
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++");
		Log.info("+ PASSED test case : "+ result.getMethod().getMethodName()+ "++++++++++++");
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("PASSED time :" + timeStamp);
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++");
	}

	public void onTestFailure(ITestResult result) {
		Log.error("+++++++++++++++++++++++++++++++++++++++++++++");
		Log.error("+ FAILED test case : "+ result.getMethod().getMethodName()+ "++++++++++++");
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.error("FAILED time :" + timeStamp);
		Log.error(result.getThrowable().toString());
		Log.error("+++++++++++++++++++++++++++++++++++++++++++++");
		
		
	}
	

}
