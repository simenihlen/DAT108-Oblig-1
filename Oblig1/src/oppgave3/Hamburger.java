package oppgave3;

public class Hamburger {

	private String hamburger;

	public Hamburger() {
	}

	public String addBurger(int antallBurger) {
		hamburger= "◖" + antallBurger + "◗";
		return hamburger;

	}

	public String getHamburger(int antallBurger) {
		 return "◖" + antallBurger + "◗";
	}

	@Override
	public String toString() {
		return hamburger;
	}

	
}
