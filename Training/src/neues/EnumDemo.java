package neues;

public class EnumDemo {

	public static void main(String[] args) {
		
		Wochentag mo = Wochentag.MONTAG;
		Wochentag di = Wochentag.DIENSTAG;
		
		if ( mo == Wochentag.MONTAG) {
			System.out.println("Es ist ein Montag.");
		}
		
		System.out.println(mo.getText());		
		System.out.println(di.getText());
	}

}
