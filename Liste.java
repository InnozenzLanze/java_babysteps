public class Liste {	//EinfachVerketteteListe
	ListenElement listenKopf;

	public Liste(String wert) {	//Konstruktor
		listenKopf = new ListenElement(wert);
	}
	
	//Anfügen am Ende der Liste
	public void fuegeHinzu(Inhalt inhalt) { 	// addLast(Object o)
		ListenElement neuesElement = new ListenElement(inhalt);
		ListenElement nachfolger = getNachfolger();
		nachfolger.setNachfolger(neuesElement);
	}
		
	/*
	fuegeHinzuHinter() {
		
	}
	*/
	
	/*
	loescheElement() {
		
	}
	*/
	
	/*
	public int laenge() {
		
	}
	*/
	
	/*
	getKopfElement() {
		
	}
	*/
	
	/*
	getLetztesElement() {
		
	}
	*/
	
	
	
	
	
}