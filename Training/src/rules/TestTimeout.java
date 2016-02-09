package rules;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TestTimeout {
	
	@Rule
	public Timeout timeoutRule = new Timeout(1, TimeUnit.SECONDS);
	
	@Test
	public void testeTimeout() {
		for ( int index1 = 1; index1 <= 30000; index1++ ) {
			for ( int index2 = 1; index2 <= 30000; index2++ ) {			
				System.out.println(index2);
			}
			System.out.println(index1);
		}			
	}
}
