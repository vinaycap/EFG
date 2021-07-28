package Listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class MyListener implements IAnnotationTransformer,ITestListener {
int counter=2;
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if(testMethod.getName().equals("TestAT")) {
			System.out.println("Changing Invocation count"+ testMethod.getName());
			annotation.setInvocationCount(counter);
			
		}
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Method started"+ result.getName());
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Method passed"+ result.getName());
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Method failed"+ result.getName());
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Method skipped"+ result.getName());
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Method failed with certain success percentage"+ result.getName());
		
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method started");
		
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");
		
	}

	
	
	
}
