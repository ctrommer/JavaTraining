package basics;

public class CallbackDemo {
	
	CalledClass calledClass;
		
	public CalledClass getCalledClass() {
		return calledClass;
	}

	public void setCalledClass(CalledClass calledClass) {
		this.calledClass = calledClass;
	}

	void rufeCallbackAuf() {
		calledClass.demo();
	}

	public static void main(String[] args) {
		CallbackDemo callbackDemo = new CallbackDemo();
		callbackDemo.setCalledClass(new CalledClass());
		callbackDemo.rufeCallbackAuf();
	}

}
