package oppgave3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Hamburgerbrett {

	private int kapasitet;
	private int antallBurgere;
	private Hamburger burger;

	BlockingQueue<String> bq;

	public Hamburgerbrett(int kapasitet) {
		this.kapasitet = kapasitet;
		this.burger = new Hamburger();
		this.antallBurgere = 1;
		this.bq = new LinkedBlockingQueue<>(kapasitet);

	}

	public int getKapasitet() {
		return kapasitet;
	}

	public synchronized void leggTil() throws InterruptedException {

		String test2 = addBurger(antallBurgere);

		System.out.println(
				Thread.currentThread().getName() + " legger på hamburger " + test2 + "," + " Brett: " + skrivUt());

	}

	public synchronized void fjern() throws InterruptedException {
		String test5 = removeBurger();
		System.out.println(Thread.currentThread().getName() + " serverte en burger " + test5);

	}

	private String addBurger(int test) {
		String burgerBrett = null;
		try {
			bq.put(burger.addBurger(test));
			burgerBrett = burger.getHamburger(antallBurgere);
			this.antallBurgere++;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return burgerBrett;

	}// end addBurger

	private String removeBurger() {
		String test3 = null;
		try {
			test3 = bq.take();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return test3;
	}

	private String skrivUt() {
		return bq.toString();

	}

}
