package neues;

import org.junit.Test;

public class DefaultStaticTest {
	
	static public void testDefault( DefaultStaticDemo defaultStaticDemo ) {
		defaultStaticDemo.defaultDemo();
	}
	
	@Test
	public void testInterface() {
		DefaultStaticDemo.staticDemo();
		
		testDefault(new DefaultStaticDemo() {
		});
		
	}

}
