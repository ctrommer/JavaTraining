package basics;

class Tier {
	
	public Tier() {
	}

	final void finalMethod() {
		System.out.println("Tier finalMethod");
		privateMethod();
	}
	
	static void staticMethod() {
		System.out.println("Tier static Method");		
	}
	
	private void privateMethod() {
		System.out.println("Tier private Method");
	}
	
}
