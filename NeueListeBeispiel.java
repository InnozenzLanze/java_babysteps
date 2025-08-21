public class NeueListeBeispiel {	//Skript Uni Ulm, "9.1 Listen" S. 53
	public static void main(String[] args) {
		Liste meineListe = new Liste(22);
		meineListe.fuegeHinzu(43);
		meineListe.fuegeHinzu(12);
		
		ListenElement aktuellesElement = meineListe.listenKopf;
		while(null !=aktuellesElement){
			//etwas mit dem aktuellen Element machen, danach...
			System.out.println("Es passiert was");
			aktuellesElement = aktuellesElement.nachfolger;
		}
	}
}
