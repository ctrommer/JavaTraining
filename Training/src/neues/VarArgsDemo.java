package neues;

public class VarArgsDemo {
	
	@SafeVarargs
	static void gebeStringsAus( String ... strings ) {
		System.out.println(strings.length);
		
		for (String string : strings) {
			System.out.println(string);			
		}
	}

	@SafeVarargs
	static <T> T[] gebeAusSafe( T ... auszugeben ) {

		for (T t : auszugeben) {
			System.out.println(t);
		}
		return auszugeben;

	}
	
//	static <T> T[] gebeAusUnSafe( T a, T b ) {
//
//		return gebeAusSafe(a,b);
//
//	}

	public static void main(String[] args) {
		
		gebeStringsAus("a","b","c");
		
		String[] stringsSafe = gebeAusSafe("a","b","c");
		
//		String[] stringsUnSafe = gebeAusUnSafe( "a", "b");
		
		System.out.println(stringsSafe);
//		System.out.println(stringsUnSafe);
		
		
	}

}
