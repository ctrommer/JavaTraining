package rules;

import org.junit.Rule;
import org.junit.Test;

public class TestPieper {
	
	@Rule
	public MeinePieperRule meinePieperRule = new MeinePieperRule();
	
	@Test
	public void testePiepen() {
		Bruch bruch = new Bruch(0, 0);		
		System.out.println(bruch);
	}
}
