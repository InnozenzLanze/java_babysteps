public class NeuesKontoStart {
	public static void main (String [] args){
		//Konstruktor 1
		Konto giro = new Konto("Max Muster", 122.77, 1234567, 10050000, 0);
				
		//Konstruktor 2
		Konto spar = new Konto("Max Muster", 98765, 25050180, 0);
		
		//Setzen Guthaben
		giro.setGuthaben(0.0);
		spar.setGuthaben(0.0);
		
		if(giro.getGuthaben() < spar.getGuthaben()) {
			System.out.println("Sparkonto voller als Girokonto.");
		} else {
			System.out.println("Girokonto voller als Sparkonto.");
		}
		
		if (Konto.anzahl > 0) { 	//Wenn mind. 1 Konto existiert
			System.out.println("Es sind " + Konto.anzahl + " Konten verfügbar");
		} else {
			System.out.println("Keine Konten verfügbar");
		}
	}
}