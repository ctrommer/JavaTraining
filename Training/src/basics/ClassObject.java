package basics;

public class ClassObject {

	public static void main(String[] args) {

		Class<Motorrad> clazz1 = Motorrad.class;
		System.out.println(clazz1.getName());
		
		Fahrzeug fahrzeug = new Motorrad(300);
		if ( fahrzeug instanceof Motorrad ) {
			System.out.println("ist ein Motorrad");
		}
		
		if( Motorrad.class.isInstance(fahrzeug)) {
			System.out.println("ist ein Motorrad");			
		}
		
		if ( fahrzeug.getClass() == Motorrad.class ) {
			System.out.println("ist ein Motorrad");			
		}

		try {
			Class<?> clazz2 = Class.forName("basics.Motorrad");

			Motorrad motorrad = (Motorrad) clazz2.newInstance();
			
			System.out.println(motorrad.getGewicht());
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
