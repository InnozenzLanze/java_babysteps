import java.util.*;

public class farbBerechnungRaum {
	public static void main(String[] args) {
		
		//Deklaration ggf. Initialisierung
		Scanner raum = new Scanner (System.in);
		double raumLaenge, raumBreite, raumHoehe, raumFlaeche;
		int anzahlFenster, anzahlTuer;
		double fensterHoehe = 0, fensterBreite = 0, fensterFlaeche;
		double tuerHoehe = 0, tuerBreite = 0, tuerFlaeche;
		double farbVerbrauchsFaktor = 0.15; //Liter pro m^2
		double farbVerbrauch;
				
		//Eingaben
		System.out.print("Bitte geben Sie die Raumlänge ein: ");
		raumLaenge = raum.nextDouble();
		System.out.print("Bitte geben Sie die Raumbreite ein: ");
		raumBreite = raum.nextDouble();
		System.out.print("Bitte geben Sie die Raumhöhe ein: ");
		raumHoehe = raum.nextDouble();
		
		System.out.print("Bitte geben Sie die Anzahl der Türen ein: ");
		anzahlTuer = raum.nextInt();
		System.out.print("Bitte geben Sie die Anzahl der Fenster ein: ");
		anzahlFenster = raum.nextInt();
		
		if (anzahlTuer >= 1) {
			// Eingaben
			System.out.print("Bitte geben Sie die Höhe der Tür/en ein: ");
			tuerHoehe = raum.nextDouble();
			System.out.print("Bitte geben Sie die Breite der Tür/en ein: ");
			tuerBreite = raum.nextDouble();
			
			//Verarbeitung
			tuerFlaeche = tuerHoehe * tuerBreite * anzahlTuer;
		} else {
			tuerFlaeche = 0;
		}
		
		if (anzahlFenster >=1) {
			//Eingaben
			System.out.print("Bitte geben Sie die Höhe der/des Fenster/s ein: ");
			fensterHoehe = raum.nextDouble();
			System.out.print("Bitte geben Sie die Breite der/des Fenster/s ein: ");
			fensterBreite = raum.nextDouble();
			
			//Verarbeitung
			fensterFlaeche = fensterHoehe * fensterBreite * anzahlFenster;
		} else {
			fensterFlaeche = 0;
		}	
		
		//Verarbeitung
		raumFlaeche = 2 * raumBreite * raumHoehe + 2 * raumLaenge * raumHoehe - tuerFlaeche - fensterFlaeche;
		farbVerbrauch = raumFlaeche * farbVerbrauchsFaktor;
		
		//Ausgabe
		System.out.println("-------------- Vielen Dank.");
		System.out.println("Ihre Angaben:");
		//Raumangaben
		System.out.print("Raumlänge: " + raumLaenge + "m, ");
		System.out.print("Raumbreite: " + raumBreite + "m, ");
		System.out.println("Raumhöhe: " + raumHoehe + "m. ");
		System.out.println("- - - - - - - - - -");
		//Fenster, Türen
		if (anzahlFenster >=1) {
			System.out.print("Anzahl Fenster: " + anzahlFenster + ", ");
			System.out.print("Fensterhöhe: " + fensterHoehe + "m, ");
			System.out.println("Fensterbreite: " + fensterBreite + "m. ");
			System.out.println("- - - - - - - - - -");
		} else {
			System.out.println("Es wurden keine Fenster berücksichtigt.");
			System.out.println("- - - - - - - - - -");
		}
		
		if (anzahlTuer >=1) {
			System.out.print("Anzahl Türen: " + anzahlTuer + ", ");
			System.out.print("Türhöhe: " + tuerHoehe + "m, ");
			System.out.println("Türbreite: " + tuerBreite + "m. ");
			System.out.println("- - - - - - - - - -");
		} else {
			System.out.println("Es wurden keine Türen berücksichtigt.");
			System.out.println("- - - - - - - - - -");
		}
		
		System.out.println("Es sind " + raumFlaeche + "m^2 Fläche Wand zu streichen. (ohne Decke)");
		System.out.println("Hierfür werden " + farbVerbrauch + "Liter Farbe benötigt.");
	}
}