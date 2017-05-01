package neuesJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class PersonStatischeMethodeDemo {
	
	public static void main(String[] args) {
		Person karl = new Person("Karl");

		List<Person> personenListe = Arrays.asList(karl);
		
		Consumer<Person> consumer1 = Person::begruesse;
		Consumer<Person> consumer2 = Person::gibNamenAus;
		
		personenListe.forEach(consumer1);		
		personenListe.forEach(consumer2);		
		
	}	
}
