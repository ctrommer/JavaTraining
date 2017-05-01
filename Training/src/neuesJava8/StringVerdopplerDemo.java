package neuesJava8;

public class StringVerdopplerDemo {

	private static void demonstrierePaarung( ) {
		
		// mit anonymer Klasse		
		StringVerdoppler functionalInterfaceMitAnonymerKlasse = new StringVerdoppler() {			
			@Override
			public String verdopple(String s) { return s + s; }
		};

		String verdoppelt = functionalInterfaceMitAnonymerKlasse.verdopple("Wissen");
		System.out.println(verdoppelt);
		
		// mit Lambda 1		
		StringVerdoppler functionalInterfaceMitLambdaGepaart1 = ( String s ) -> { return s + s; };
		
		// mit Lambda 2		
		StringVerdoppler functionalInterfaceMitLambdaGepaart2 = s -> { return s + s; };
		
		// mit Lambda 3		
		StringVerdoppler functionalInterfaceMitLambdaGepaart3 = s -> s + s;
		
		verdoppelt = functionalInterfaceMitLambdaGepaart1.verdopple("Wissen");
		verdoppelt = functionalInterfaceMitLambdaGepaart2.verdopple("Wissen");
		verdoppelt = functionalInterfaceMitLambdaGepaart3.verdopple("Wissen");			
		System.out.println(verdoppelt);
	}

	private static void demonstrierePaarungMethodenaufruf( String zuVerdoppeln, StringVerdoppler verdoppler ) {
		String verdoppelt = verdoppler.verdopple(zuVerdoppeln);			
		System.out.println(verdoppelt);
	}

  	public static void main(String[] args) {
  		
  		demonstrierePaarung();
  		
  		// ohne Lambda mit anonymous inner class
  		demonstrierePaarungMethodenaufruf("Wissen", new StringVerdoppler() {			
  			@Override
  			public String verdopple(String zuVerdoppeln) {
  				return zuVerdoppeln + zuVerdoppeln;
  			}
  		});
  		
  		// mit Lambda 1:
  		demonstrierePaarungMethodenaufruf("Wissen", ( String s ) -> { return s + s; });
  		
  		// mit Lambda 2:
  		demonstrierePaarungMethodenaufruf("Wissen", s -> { return s + s; });
  		
  		// mit Lambda 3:
  		demonstrierePaarungMethodenaufruf("Wissen", s -> s + s);
  	}
}
