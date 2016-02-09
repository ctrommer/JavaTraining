package exceptions;

import javax.management.BadStringOperationException;

public class Investment {
	public void unhandeledExceptionDemo() {
		throw new NullPointerException();
	}
	
	public void handeledExceptionDemo() throws BadStringOperationException {
		throw new BadStringOperationException("Nur als Demo");
	}	
}
