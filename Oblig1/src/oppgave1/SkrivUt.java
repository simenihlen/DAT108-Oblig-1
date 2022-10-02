package oppgave1;

public class SkrivUt extends Thread {
	boolean fortsette = true;
	private Tekst tekst;

	public SkrivUt(Tekst tekst) {
		this.tekst = tekst;
	}
	public void stopp() {
		fortsette = false;
	}

	public void run() { {

			while (fortsette == true) {

				try {
					System.out.println(tekst.getTekst());
					Thread.sleep(3000);

				} catch (NullPointerException | InterruptedException e) {

				}
			}
		}
	}

}
