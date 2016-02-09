package basics;

public final class ImmutableDemo {
	
	private final String string;
	private final StringBuilder stringBuilder;

	public ImmutableDemo(String string, StringBuilder stringBuilder) {
		super();
		this.string = string;
		this.stringBuilder = stringBuilder;
	}

	public String getString() {
		return string;
	}

	public StringBuilder getStringBuilder() {
		return new StringBuilder( stringBuilder.toString() );
	}

	@Override
	public String toString() {
		return "ImmutableDemo [string=" + string + ", stringBuilder=" + stringBuilder + "]";
	}

	public static void main(String[] args) {
		
		ImmutableDemo immutableDemo = new ImmutableDemo("erster", new StringBuilder("zweiter"));
		
		String string = immutableDemo.getString();
		StringBuilder stringBuilder = immutableDemo.getStringBuilder();
		
		string = "Hallo";
		stringBuilder = new StringBuilder("Welt");
		
		System.out.println(string + " " + stringBuilder);
		System.out.println(immutableDemo.toString());
	}
}
