package oppgave1;

import javax.swing.JOptionPane;

public class Pane extends Thread {
	boolean fortsette = true;
	private Tekst tekst;
	
	public Pane(Tekst tekst) {
		this.tekst = tekst;
	}
	public void run() {
		{

			while (fortsette == true) {
				try {
					Thread.sleep(1000);
					tekst.setTekst(JOptionPane.showInputDialog("Tast inn"));
				}catch (InterruptedException e) {
					
				}
				
			}
		}

	}
}
