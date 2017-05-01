package neuesJava8;

public class Person {
	String name;

	Person(String name) {
		super();
		this.name = name;
	}

	static void begruesse( Person p ) {
		System.out.println("Hallo " + p.getName() );		
	}
	
	static String verdoppleStatisch( Person p ) {
		return p.name + p.name;
	}
	
	String verdoppleNichtStatisch( Person p ) {
		return p.name + p.name;
	}	
	
	void gibNamenAus() {
		System.out.println( getName() );		
	}
	

	String getName() {
		return name;
	}

}
