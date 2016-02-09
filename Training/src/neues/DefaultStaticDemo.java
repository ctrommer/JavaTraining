package neues;

public interface DefaultStaticDemo {
	default void defaultDemo() {
		System.out.println("Default von interface");
	}
	
	static void staticDemo() {
		System.out.println("static von interface");		
	}

}
