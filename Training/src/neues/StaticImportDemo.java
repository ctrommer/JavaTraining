package neues;

import mockito.Uebersetzer;

import static org.mockito.Mockito.mock;

public class StaticImportDemo {

	public static void main(String[] args) {
		
		Uebersetzer uebersetzer = mock(Uebersetzer.class);
		
		System.out.println(uebersetzer);

	}

}
