package rules;

public class Bruch {
	int zaehler;
	int nenner;
	public Bruch(int zaehler, int nenner) {
		super();
		if ( nenner == 0 ) {
			throw new IllegalArgumentException("Zaehler darf nicht null sein.");
		}
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	@Override
	public String toString() {
		return "Bruch [zaehler=" + zaehler + ", nenner=" + nenner + "]";
	}
	public int getZaehler() {
		return zaehler;
	}
	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}
	public int getNenner() {
		return nenner;
	}
	public void setNenner(int nenner) {
		this.nenner = nenner;
	};
	
}
