package neuesJava8;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<String> stringErzeuger = ()-> new String("Hallo");
		
		String hallo = stringErzeuger.get();
		
		System.out.println(hallo);

	}

}
