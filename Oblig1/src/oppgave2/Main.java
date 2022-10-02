package oppgave2;

public class Main {

	public static void main(String[] args) {

		final String[] kokker = {"Anne","Erik","Knut"};
		final String[] servitorer = {"Mia","Per"};
		final int KAPASITET = 4;
		
		Hamburgerbrett brett = new Hamburgerbrett(KAPASITET);
		skrivUtHeader(kokker, servitorer, KAPASITET);
		
		for (String navn: kokker) {
			new Kokk(brett,navn).start();;
		}
		for (String navn: servitorer) {
			new Servitor(brett,navn).start();
		}
		
	}//end main

	
	
	
	
	
	
	
	
	private static void skrivUtHeader(String[] kokker, String[] servitorer,int KAPASITET) {
		System.out.println("I denne simuleringen har vi");
		System.out.print(kokker.length+" kokker [");
		for(String kokk:kokker) {
			System.out.print(kokk+" ");
		}
		System.out.println("]");
		
		System.out.print(servitorer.length +" servitører [");
		for(String servitor:servitorer) {
			System.out.print(servitor+ " ");
		}
		System.out.println("]");
		
		System.out.println("Kapasiteten til brettet er "+KAPASITET+" hamburgere");
	}//end skrivUtHeader
	@Override
	public String toString() {
		return "To string sier hei fra main ";
	}
	
}//end Main class
