package oppgave2;

import java.util.Random;

public class Kokk extends Thread {

	private Hamburgerbrett brett;
	String kokk;
	private Random random = new Random();

	public Kokk(Hamburgerbrett brett, String kokk) {
		this.brett = brett;
		this.setName(kokk);
	}

	@Override
	public void run() {
		

			while (true) {
				try {
					Thread.sleep(random.nextInt(4000) + 2000);
					brett.leggTil();
				} catch (InterruptedException e) {
				}
			
		}
	}
//	private Hamburger lagBurger() {
//		return new Hamburger();
//	}

}
