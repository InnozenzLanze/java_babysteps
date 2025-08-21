public class NeueListeBeispiel {	//Skript Uni Ulm, "9.1 Listen" S. 53
	public static void main(String[] args) {
		Liste meineListe = new Liste();
		meineListe.fuegeHinzu("22");
		meineListe.fuegeHinzu("43");
		meineListe.fuegeHinzu("12");
		
		ListenElement aktuellesElement = meineListe.listenKopf;
		while(null !=aktuellesElement){
			//etwas mit dem aktuellen Element machen, danach...
			System.out.println("Es passiert was");
			aktuellesElement = aktuellesElement.nachfolger;
		}
	}
	/*
	C:\Users\Icarus\Documents\GitHub\java_babysteps>javac NeueListeBeispiel.java
.\Liste.java:9: error: cannot find symbol
        public void fuegeHinzu(Inhalt inhalt) {         // addLast(Object o)
                               ^
  symbol:   class Inhalt
  location: class Liste
.\ListenElement.java:2: error: cannot find symbol
        Inhalt inhalt;  //Object obj;
        ^
  symbol:   class Inhalt
  location: class ListenElement
.\ListenElement.java:5: error: cannot find symbol
        public ListenElement(Inhalt inhalt) {   //Konstruktor
                             ^
  symbol:   class Inhalt
  location: class ListenElement
.\ListenElement.java:18: error: cannot find symbol
        public Inhalt getInhalt() { //Object getObj()
               ^
  symbol:   class Inhalt
  location: class ListenElement
NeueListeBeispiel.java:3: error: constructor Liste in class Liste cannot be applied to given types;
                Liste meineListe = new Liste();
                                   ^
  required: String
  found:    no arguments
  reason: actual and formal argument lists differ in length
.\Liste.java:11: error: cannot find symbol
                ListenElement nachfolger = getNachfolger();
                                           ^
  symbol:   method getNachfolger()
  location: class Liste
6 errors
	*/
}
