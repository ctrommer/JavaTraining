package basics;

class Hund extends Tier{
	

	// Achtung: würden die Methoden der Basisklasse verdecken 
	
//	static void staticMethod() {
//		System.out.println("Hund static Method");		
//	}
//
//	private void privateMethod() {
//		System.out.println("Hund private Method");
//	}	

	public Hund() {
	}

	public static void main(String[] args) {

		Hund.staticMethod();

		Hund hund = new Hund();		
		hund.finalMethod();		

//		hund.privateMethod();
	}

}
