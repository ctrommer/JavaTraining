package neues;

import rules.Bruch;

public class GenericKlasseDemo<S extends Bruch> {

	S wert;

	public GenericKlasseDemo(S wert) {
		super();
		this.wert = wert;
	}
	
	void ausgabe() {
		System.out.println(wert);
	}
	
	int alsGerundeteZahl() {
		return wert.getZaehler() / wert.getNenner();
	}

	public static void main(String[] args) {
		GenericKlasseDemo<Bruch> genericsDemo = new GenericKlasseDemo<>(new Bruch(5,2));

		genericsDemo.ausgabe();
		
		System.out.println(genericsDemo.alsGerundeteZahl());
		
	}
}
