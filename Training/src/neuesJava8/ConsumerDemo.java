package neuesJava8;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> begruesser1 = (s) -> System.out.println("Hallo , " + s);
		begruesser1.accept("arnold");		
		
		Consumer<Person> begruesser2 = (p) -> System.out.println("Hallo von Consumer , " + p.name);
		Person arnold = new Person("Arnold");
		begruesser2.accept(arnold);		
	}
}
