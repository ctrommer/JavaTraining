package neuesJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class ComperatorDemo {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("Karl", "Arnold", "Gustav");

		// Sortieren mit anonymer Klasse
		stringList.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		stringList.forEach(System.out::println);

		// Lambda erzeugen ...
		Comparator<String> stringComparator = ((s1, s2)-> s1.compareTo(s2));

		// ... und damit sortieren
		stringList.sort(stringComparator);		
		stringList.forEach(System.out::println);

		// ... und damit rückwärts sortieren
		stringList.sort(stringComparator.reversed());		
		stringList.forEach(System.out::println);

		// Sortieren mit Lambda
		stringList.sort((s1, s2)-> s1.compareTo(s2));
		stringList.forEach(System.out::println);
	}

}
