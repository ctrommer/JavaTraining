package threads;

public class AusgabeThreadStarter {

	public static void main(String[] args) {
		Runnable ersterAusgabeThreadStarter = new  ConsoleAusgeber("XXX erster Thread XXX", 1000);
		Runnable zweiterAusgabeThreadStarter = new ConsoleAusgeber("OOO zweiter Thread OOO", 2000);
		
		Thread ersterThread = new Thread(ersterAusgabeThreadStarter);
		Thread zweiterThread  = new Thread(zweiterAusgabeThreadStarter);
		
		ersterThread.start();
		zweiterThread.start();
	}

}
