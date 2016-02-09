package exceptions;

import javax.management.BadStringOperationException;

public class Aktie extends Investment{

	@Override
	public void unhandeledExceptionDemo() {
		super.unhandeledExceptionDemo();
		throw new RuntimeException();
	}

	@Override
	public void handeledExceptionDemo() throws BadStringOperationException {
		super.handeledExceptionDemo();
	}

	public static void main(String[] args) {
		Aktie aktie = new Aktie();
		
		try {
			aktie.handeledExceptionDemo();
		} catch (BadStringOperationException e) {
			e.printStackTrace();
		} finally {
			System.out.println("wird immer aufgerufen");
		}
		
		aktie.unhandeledExceptionDemo();
	}

}
