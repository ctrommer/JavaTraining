package basics;

public class OuterClass {
	int aeussereZahl = 1;
	static int aeussereStaticZahl = 2;

	public static class NestedClass {
		int x = 3;
		static int y = 4;
		
		public int summeDerErreichbarenZahlen() {
			return (aeussereStaticZahl + x + y); 
		}		
	}

	public class MyInnerClass {
		int summeDerErreichbarenZahlen() {
			return (aeussereZahl + aeussereStaticZahl); 
		}		
	}

	void localInnerClassDemo() {
		final class MyLocalInnerClass {
			
		}
		
		MyLocalInnerClass myLocalInnerClass = new MyLocalInnerClass();
		System.out.println(myLocalInnerClass);		
	}
}
