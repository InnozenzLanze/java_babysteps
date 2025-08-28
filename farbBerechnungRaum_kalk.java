import java.util.*;

public class farbBerechnungRaum_kalk {
	public static void main(String[] args) {
		
		//Deklaration Kunde
		Scanner kunde = new Scanner (System.in);
		String kundeNachname, kundePlz, kundeOrt;
		
		//Deklaration ggf. Initialisierung Raum
		Scanner raum = new Scanner (System.in);
		double raumLaenge, raumBreite, raumHoehe, raumFlaeche;
		int anzahlFenster, anzahlTuer;
		double fensterHoehe = 0, fensterBreite = 0, fensterFlaeche;
		double tuerHoehe = 0, tuerBreite = 0, tuerFlaeche;
		
		//Deklaration ggf. Initialisierung Farbe und Kosten
		double farbVerbrauchsFaktor = 0.15; //Liter pro m^2
		double farbVerbrauch;
		double kostenFarbe = 15.20; //Preis pro Liter
		double arbeitsLohn = 12.55; //Pro m^2
		double gesamtKosten;
		
		//Eingaben Kunde
		System.out.println("Bitte machen Sie folgende Angaben zum Kunden.");
		System.out.print("Nachname: ");
		kundeNachname = kunde.next();
		System.out.print("Postleitzahl: ");
		kundePlz = kunde.next();
		System.out.print("Ort: ");
		kundeOrt = kunde.next();
		
		//Eingaben Raum
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
		
		//Verarbeitung Raum
		raumFlaeche = 2 * raumBreite * raumHoehe + 2 * raumLaenge * raumHoehe - tuerFlaeche - fensterFlaeche;
		
		//Verarbeitung Farbverbrauch und Kosten
		farbVerbrauch = raumFlaeche * farbVerbrauchsFaktor;
		gesamtKosten = raumFlaeche * arbeitsLohn + farbVerbrauch * kostenFarbe;
		
		//Ausgabe
		System.out.println("-- KOSTENVORANSCHLAG --");
		System.out.println(" ");
		
		System.out.println("Guten Tag " + kundeNachname + ", ");
		System.out.println("aus: " + kundePlz + " " + kundeOrt);
		System.out.println(" ");
		
		System.out.println("Es sind " + raumFlaeche + "m^2 Fläche Wand zu streichen. (ohne Decke)");
		System.out.println("Hierfür werden " + farbVerbrauch + "Liter Farbe benötigt.");
		System.out.println("Gesamte Kosten: " + gesamtKosten);
		System.out.println(" ");
		
		System.out.println("Daten zur Grundlage:");
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
	}
}