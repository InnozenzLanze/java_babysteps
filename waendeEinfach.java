import java.util.*;

public class waendeEinfach {
	public static void main(String[] args) {
		
		//Deklaration
		Scanner raum = new Scanner (System.in);
		double laenge, breite, hoehe, flaeche;
		
		//Eingaben
		System.out.print("Bitte geben Sie die Raumlänge ein: ");
		laenge = raum.nextDouble();
		
		System.out.print("Bitte geben Sie die Raumbreite ein: ");
		breite = raum.nextDouble();
		
		System.out.print("Bitte geben Sie die Raumhöhe ein: ");
		hoehe = raum.nextDouble();
		
		//Verarbeitung
		flaeche = 2 * breite * hoehe + 2 * laenge * hoehe;
		
		//Ausgabe
		System.out.print("Es sind " + flaeche + "m^2 Fläche Wand zu streichen. (ohne Decke)");
	}
}