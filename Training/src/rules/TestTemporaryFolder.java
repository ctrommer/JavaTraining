package rules;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TestTemporaryFolder {
	
	@Rule
	public TemporaryFolder temporaryFolder = new TemporaryFolder();
	
	@Test
	public void testeTemporaryFolder() {
		try {
			File file = temporaryFolder.newFile();
			Assert.assertTrue(file.exists());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
