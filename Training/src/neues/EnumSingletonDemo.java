package neues;

public class EnumSingletonDemo {

	public static void main(String[] args) {
		EnumSingleton.INSTANCE.setText("einziger");
		
		System.out.println( EnumSingleton.INSTANCE.getText() );
	}

}
