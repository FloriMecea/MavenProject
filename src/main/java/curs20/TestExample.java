package curs20;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {
	
	@Test(invocationCount=4)  //va rula metoda cu anotarea test de 4 ori
	public void runMultipleTimes() {
		System.out.println("TestNGprint");
	}
	
	//testNg ruleaza in ordine alfabetica metodele sau pui priority la toate (prioritatea 0 e cea mai mare)
	
	@RunMultipleTimes(times=4)
    @Test
	public void testAnnotation() {
		System.out.println("Annotation test print");
	}
	
	@BeforeClass   //- aceasta anotare permite ca metoda setUp sa se execute inainte de clasa
	public void setUp() throws IllegalAccessException, InvocationTargetException {
		
		TestExample testObj=new TestExample();
		for (Method method: testObj.getClass().getDeclaredMethods()) {
			if (method.isAnnotationPresent(RunMultipleTimes.class)) {
				RunMultipleTimes annotation= method.getAnnotation(RunMultipleTimes.class);
		
			    for (int i=0; i<annotation.times();i++) {
			 
			    	method.invoke(testObj);
		     	}
			}
		}
		
	}

}
