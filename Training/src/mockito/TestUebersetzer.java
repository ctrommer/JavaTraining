package mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * 
 * 1. Mockito downloaden: google | mockito download jar -> http://www.java2s.com/Code/Jar/m/Downloadmockitoall195jar.htm
 * 		Achtung: hatte vorher das mockito genommen, was ich schon hatte. Leider bekam ich dadurch eine ClassNotFoundException.
 * 
 * 2. Rechte Maus auf Projekt | Build Path | Configure Build Path | 
 * 		Libraries | Add external jar ... | mocktio auswählen
 * 
 */
public class TestUebersetzer {
	@Test
	public void testeUebersetzer() {

		Uebersetzer mockUebersetzer = Mockito.mock(Uebersetzer.class);
		
		Mockito.when(mockUebersetzer.uebersetze("Welt")).thenReturn("World");
		
		UebersetzerSchnittstelle zuTesten = new UebersetzerSchnittstelle();
		
		String uebersetzung = zuTesten.uebersetze(mockUebersetzer, "Welt");
		
		Assert.assertTrue(uebersetzung.equals("World"));
	}
}
