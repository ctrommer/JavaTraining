package basics;

public abstract class Fahrzeug {
	private int gewicht;

	public Fahrzeug(int gewicht) {
		super();
		this.gewicht = gewicht;
	}
	
	abstract void gebeAus();

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}	
}
