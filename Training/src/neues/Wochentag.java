package neues;

public enum Wochentag {
	
	MONTAG("Montag"), DIENSTAG("Dienstag") {

		@Override
		public String getText() {
			return "Tuesday";
		} };
	
	String text;

	private Wochentag(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
