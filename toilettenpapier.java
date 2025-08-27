/*
"JAVA Aufgaben und Übungen
Aufgaben, Lösungen, PAP und Struktogramme für den IT-Unterricht" 
Erich J.Schreiber, Springer Verlag 2023,
2.5.2 Aufgabe: Gewicht Toilettenpapier
*/

public class toilettenpapier {
	public static void main(String[] args) {
		
		//Deklaration und Initialisierung
		int anzahlPackungen = 10;		//Anzahl, die gekauft werden soll
		int blattMenge = 250;			//pro Rolle
		int anzahlRollen = 8; 			//in Familienpackung
		double blattGroesseX = 120;		//in mm
		double blattGroesseY = 98;			//in mm
		int papierLagen = 3;			//pro Blatt
		double gewichtPapier = 16.5;	//g/m^3
		
		double blattGroesseQuadratM;
		double gewichtBlattKg;
		double gewichtRolle;
		double gewichtFamilienPackung;
		double gewichtKofferraumLadung;
		
		//Verarbeitung
		blattGroesseQuadratM = blattGroesseX * blattGroesseY / 1000 / 1000; 	// 100mm^2 = 1cm^2, 1.000mm = 100cm = 10dm = 1m
		gewichtBlattKg = blattGroesseQuadratM * gewichtPapier * papierLagen; // in Gramm
		gewichtRolle = blattMenge * gewichtBlattKg;
		gewichtFamilienPackung = anzahlRollen * gewichtRolle;
		gewichtKofferraumLadung = anzahlPackungen * gewichtFamilienPackung / 1000; //1000g = 1kg
		
		//Ausgabe
		System.out.println("Blattgröße in m^2: " + blattGroesseQuadratM);
		System.out.println("Gewicht pro Blatt in kg: " + gewichtBlattKg);
		System.out.println("Gewicht pro Rolle in kg: " + gewichtRolle);
		System.out.println("Gewicht pro Familienpackung in kg: " + gewichtFamilienPackung);
		System.out.println(anzahlPackungen + "Familienpackungen Toilettenpapier wiegen " + gewichtKofferraumLadung + "kg.");
	}
}