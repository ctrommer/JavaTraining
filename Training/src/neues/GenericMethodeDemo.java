package neues;

public class GenericMethodeDemo {

	<T> T ausgabe( T auszugeben ) {		
		System.out.println(auszugeben);
		return auszugeben;
	}

	public static void main(String[] args) {		
		GenericMethodeDemo genericsDemo = new GenericMethodeDemo();
		genericsDemo.ausgabe("Testausgabe");		
	}
}
