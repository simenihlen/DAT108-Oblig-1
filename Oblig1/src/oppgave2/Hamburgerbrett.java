package oppgave2;

public class Hamburgerbrett {

	private int kapasitet;
	private int antall;
	private int antallBurgere;
	private Hamburger[] brett;
	private Hamburger burger;

	public Hamburgerbrett(int kapasitet) {
		this.kapasitet = kapasitet;
		this.brett = new Hamburger[kapasitet];
		this.burger = new Hamburger(antallBurgere);
		this.antallBurgere = 1;

	}

	public int getKapasitet() {
		return kapasitet;
	}

	public synchronized void leggTil() throws InterruptedException {
		while (erFull()) {
			System.out.println("Brettet er fullt. Venter på servitører");
			wait();
			
		}

		addBurger(antallBurgere);

		System.out.println(Thread.currentThread().getName() + " legger på hamburger " + brett[antall - 1].getHamburger()
				+ ". Brett: " + skrivUt());

		if (antall == 1) {
			notify();
		}
	}

	public synchronized void fjern() throws InterruptedException {
		while (erTomt()) {
			System.out.println("Brettet er tomt. Venter på kokker");
			wait();
			
		}
		String servert = removeBurger();
		System.out.println(Thread.currentThread().getName() + " serverte en burger " + servert);
		if (antall == 3) {
			notify();
		}
	}

	private void addBurger(int test) {
		burger.addBurger(test);
		brett[antall] = new Hamburger(test);
		this.antallBurgere++;
		antall++;

	}// end addBurger

	private String removeBurger() {
		Hamburger ut = brett[0];
		antall--;
		for (int i = 0; i < antall; i++) {
			brett[i] = brett[i + 1];
		}
		brett[antall] = null;

		return ut.getHamburger();
	}

	public synchronized boolean erFull() {
		return antall == kapasitet;
	}

	public synchronized boolean erTomt() {
		return brett[0] == null;
	}

	private String skrivUt() {
		synchronized (brett) {

			String temp = "";

			for (int i = 0; i < brett.length; i++) {
				if (brett[i] == null) {
					return temp;
				}
				temp += brett[i].getHamburger() + " ";
			}
			return temp;
		}
	}

}
