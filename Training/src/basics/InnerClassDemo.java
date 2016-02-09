package basics;

public class InnerClassDemo {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.MyInnerClass inner = outer.new MyInnerClass();
		System.out.println(inner.summeDerErreichbarenZahlen());
		
		outer.localInnerClassDemo();
		
		OuterClass.NestedClass nested = new OuterClass.NestedClass();		
		System.out.println(nested.summeDerErreichbarenZahlen());
		
	}
}
