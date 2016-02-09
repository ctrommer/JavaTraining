package neues;

public class LambdasDemo {
	
	public static void begruesserDemo( Begruesser b, String s ) {
		b.begruesse(s);
	}

	public static void main(String[] args) {		
		begruesserDemo(n->System.out.println(n), "Hans");
		
		begruesserDemo(new Begruesser() {
			
			@Override
			public void begruesse(String s) {
				System.out.println(s);

				
			}
		}, "Franz" );
		
	}

}
