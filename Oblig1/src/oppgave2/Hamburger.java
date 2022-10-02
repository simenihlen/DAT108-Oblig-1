package oppgave2;

public class Hamburger {

	private int antall;
	private String hamburger;

	public Hamburger(int antallBurger) {
		this.antall = antallBurger;
	}

	public String addBurger(int antallBurger) {
		this.antall++;
		hamburger= "◖" + antallBurger + "◗";
		return hamburger;

	}

	public String getHamburger() {
		 return "◖" + antall + "◗";
	}

	@Override
	public String toString() {
		return hamburger;
	}

	
}
