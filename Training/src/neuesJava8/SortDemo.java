package neuesJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Karl", "Arnold");
		
		Collections.sort(list);
		
		System.out.println(list);
				
		Collections.sort(list, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        return b.compareTo(a);
		    }
		});
		
		System.out.println(list);
		
	}

}
