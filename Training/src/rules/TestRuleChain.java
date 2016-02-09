package rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.RuleChain;

public class TestRuleChain {

	@Rule
	public MeinePieperRule meinePieperRule = new MeinePieperRule();

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Rule
	public RuleChain ruleChain = RuleChain.outerRule(meinePieperRule).around(expectedException);

	@Test
	public void testeRuleChain() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("Zaehler darf nicht null sein.");
		Bruch bruch = new Bruch(1, 0);
		System.out.println(bruch);
	}

}
