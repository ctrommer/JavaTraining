package neuesJava8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, String> stringVerdoppler = ( s ) -> s + s;
		
		Function<String, String> vervierfacher = stringVerdoppler.andThen(stringVerdoppler); 
		
		String vervierfacht = vervierfacher.apply("Hallo");

		System.out.println(vervierfacht);			
	}
}
