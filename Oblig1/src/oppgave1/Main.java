package oppgave1;

public class Main {

	public static void main(String[] args) {
		
		Tekst tekst = new Tekst();
		SkrivUt s = new SkrivUt(tekst);
		Pane t = new Pane(tekst);
		s.start();
		t.start();

	}

}
