package neuesJava8;

public class VerdopplerDemo {

	public static void main(String[] args) {

		Person arnold = new Person("Arnold");
		
		// Paarung von Functional Interface und Lambda
		// public String getName()		
		Verdoppler<Person> personVerdoppler1 = ( von ) -> von.getName() + von.getName();
		String verdoppelt = personVerdoppler1.verdopple(arnold);
		
		System.out.println(verdoppelt);

		// Paarung Functional Interface und Method Referenz mit statischer Methode 
		// public static String verdoppleStatisch( Person p )
		Verdoppler<Person> personVerdoppler2 = Person::verdoppleStatisch;
		verdoppelt = personVerdoppler2.verdopple(arnold);
		
		System.out.println(verdoppelt);
		
		// Paarung Functional Interface und Method Referenz mit nicht statischer Methode		
		// public static String verdoppleNichtStatisch( Person p );		
		Verdoppler<Person> personVerdoppler3 = arnold::verdoppleNichtStatisch;
		verdoppelt = personVerdoppler3.verdopple(arnold);
		
		System.out.println(verdoppelt);
		
		// Paarung Functional Interface und Konstruktor Referenz
		PersonenFabrik<Person> personenFabrik = Person::new;		
		Person karl = personenFabrik.erzeuge("Karl");

		System.out.println(karl.getName());
	}

}
