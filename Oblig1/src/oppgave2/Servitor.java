package oppgave2;

import java.util.Random;

public class Servitor extends Thread{

	private Hamburgerbrett brett;
	String navn;
	private Random random = new Random();
	
	public Servitor(Hamburgerbrett brett, String navn) {
		this.brett = brett;
		this.setName(navn);
	}//end Servitor constructor
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(random.nextInt(4000) + 2000);
				brett.fjern();
			} catch (InterruptedException e) {
			}
			
			brett.toString();
			System.out.println();
		}
	}
}//end Servitor
