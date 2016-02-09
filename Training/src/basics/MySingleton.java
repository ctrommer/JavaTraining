package basics;

public class MySingleton {
	
	private static final MySingleton instance = new MySingleton();
	
	private String inhalt = new String();

	private MySingleton() {
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public static MySingleton getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		
		MySingleton.getInstance().setInhalt("Test");
		System.out.println( MySingleton.getInstance().getInhalt() );

	}

}
