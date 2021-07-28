package Listeners;

import org.testng.annotations.Test;

public class IAnnotationTransformerWithExample {
	MyListener L1= new MyListener();
	@Test(invocationCount=3)
	public void TestAT() {
		System.out.println("i am from Annotation Transformer");
	}
	
}
