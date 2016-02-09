package basics;

public class Motorrad extends Fahrzeug implements Kaueflich{

	public Motorrad() {
		super(0);
	}
	
	public Motorrad(int gewicht) {
		super(gewicht);
	}

	@Override
	public void zeigePreisAn() {
		System.out.println("ganz viele " + WAEHRUNG );		
	}

	@Override
	void gebeAus() {
		zeigePreisAn();
		System.out.println( getGewicht() );
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "Motorrad [getGewicht()=" + getGewicht() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		Motorrad motorrad = new Motorrad(222);
		
		motorrad.gebeAus();
	}

}
