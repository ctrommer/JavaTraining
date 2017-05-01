package threads;

public class ConsoleAusgeber implements Runnable{
	
	String auszugeben;
	int	warteZeit;

	public ConsoleAusgeber(String auszugeben, int warteZeit) {
		super();
		this.auszugeben = auszugeben;
		this.warteZeit = warteZeit;
	}

	@Override
	public void run() {
		for ( Integer index = 0; index < 10; index++ ) {  
			System.out.println(auszugeben);
			synchronized (this) {
				try {
					wait(warteZeit);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
		}
	}
}
