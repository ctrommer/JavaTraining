package neues;

public enum EnumSingleton {
	INSTANCE( );
	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
