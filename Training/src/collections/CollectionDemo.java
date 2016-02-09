package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import basics.Fahrzeug;
import basics.Motorrad;



public class CollectionDemo {
	
	static void sortHashmap() {

		Map<String, String> map = new HashMap<>();
		map.put("a key", "a value");
		map.put("c key", "c value");
		map.put("b key", "b value");
		
		map.forEach((k,v)->System.out.println("key: " + k + " value: " + v  ));

		Map<String, String> treeMap = new TreeMap<>(map);
		
		treeMap.forEach((k,v)->System.out.println("key: " + k + " value: " + v  ));
	}

	static void einfachesArray() {
		int[] intArray = new int[] {1,2,3};
		
		for (int i : intArray) {
			System.out.println(i);
		}

	}

	static void sortArrayList() {
		
		ArrayList<String> songList = new ArrayList<String>();
		songList.add("d");
		songList.add("a");
		songList.add("c");
		songList.add("b");
		
		songList.forEach(n->System.out.println(n));
		
		Collections.sort(songList);
		songList.forEach(n->System.out.println(n));
		
	}
	
	static <T extends Fahrzeug> void akzeptiereArray( ArrayList<T> fahrzeuge ) {
		for (T t : fahrzeuge) {
			System.out.println(t);			
		}
	}
	
	static void akzeptiereArrayAufrufer() {
		ArrayList<Motorrad> motorraeder = new ArrayList<>();
		motorraeder.add(new Motorrad(222));
		motorraeder.add(new Motorrad(333));
		motorraeder.add(new Motorrad(444));
		
		akzeptiereArray(motorraeder);
		
	}
	
	static void iteratorRemoveDemo() {
		ArrayList<Motorrad> motorraeder = new ArrayList<>();
		motorraeder.add(new Motorrad(222));
		motorraeder.add(new Motorrad(333));
		motorraeder.add(new Motorrad(444));
		
		for (Iterator<Motorrad> iterator = motorraeder.iterator(); iterator.hasNext();) {
			Motorrad motorrad = iterator.next();
			if ( motorrad.getGewicht() == 333 ) {
				iterator.remove();
			}			
		}
		
		for (Motorrad motorrad : motorraeder) {
			System.out.println(motorrad.getGewicht());			
		}
	}
	
	static void listAndSetDemo( Collection<String> collection ) {
		
		System.out.println("iterator: ");
		for (Iterator<String> iterator = collection.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());			
		}
		
		System.out.println("for each: ");
		for (String string : collection) {
			System.out.println(string);
		}		

		System.out.println("while: ");
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
		
		System.out.println("for each: ");
		collection.forEach(n->System.out.println(n));

	}

	private static void mapDemo(Map<String, String> map) {		
		System.out.println("iterator: ");
		
		Set<Map.Entry<String, String>> entrySet1 = map.entrySet();		
		for( Iterator<Map.Entry<String, String>> iterator = entrySet1.iterator(); iterator.hasNext(); ) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("for each: ");
		for (Entry<String, String> entry : entrySet1) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("while: ");
		
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while( iterator.hasNext() ) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("for each: ");
		map.forEach((k,v)-> System.out.println("key: " + k + " value: " + v ));
	}
	
	static void schleifeUeberCollections() {

		System.out.println("--- list : ---");
		Collection<String> stringsInList = new ArrayList<>();		
		stringsInList.add("c");
		stringsInList.add("b");
		stringsInList.add("a");
		listAndSetDemo(stringsInList);		

		System.out.println("--- set :  ---"); 
		Collection<String> stringsInSet = new HashSet<>();
		stringsInSet.add("c");
		stringsInSet.add("b");
		stringsInSet.add("a");	
		listAndSetDemo(stringsInSet);
		
		System.out.println("--- map :  ---"); 
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		mapDemo( map );		
	}

	public static void main(String[] args) {
//		sortHashmap();
//		einfachesArray();
//		sortArrayList();		
//		akzeptiereArrayAufrufer();		
//		iteratorRemoveDemo();
		schleifeUeberCollections();
	}

}
