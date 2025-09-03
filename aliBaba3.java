import java.util.*;

public class aliBaba3 {
	public static void main(String[] args) {
		//Deklaration und Initialisierung
		String neueZeile = System.getProperty("line.separator");
		Scanner bestellung = new Scanner(System.in);
		String artikel_1, artikel_2, artikel_3;
		int anzahl_1, anzahl_2, anzahl_3;
		double preis_1, preis_2, preis_3;
		
		//Eingaben
		System.out.println("Bitte geben Sie 3 Artikel, Anzahl und Preis ein.");
		System.out.print("Artikel 1: ");
			artikel_1 = bestellung.next();
		System.out.print("Anzahl 1: ");
			anzahl_1 = bestellung.nextInt();
		System.out.print("Preis 1: ");
			preis_1 = bestellung.nextDouble();
			
		System.out.print("Artikel 2: ");
			artikel_2 = bestellung.next();
		System.out.print("Anzahl 2: ");
			anzahl_2 = bestellung.nextInt();
		System.out.print("Preis 2: ");
			preis_2 = bestellung.nextDouble();	
			
		System.out.print("Artikel 3: ");
			artikel_3 = bestellung.next();
		System.out.print("Anzahl 3: ");
			anzahl_3 = bestellung.nextInt();
		System.out.print("Preis 3: ");
			preis_3 = bestellung.nextDouble();	

			
		final double MwStProzent = 19; //Lebensmittel, in Prozent
		double MwStDivisor = MwStProzent / 100 + 1; //Brutto->Netto
		double gesamtNetto;
		double betragSteuer;
		double gesamtBrutto;
		
		//Verarbeitung
		gesamtBrutto = anzahl_1 * preis_1 + anzahl_2 * preis_2 + anzahl_3 * preis_3;
		gesamtNetto = gesamtBrutto / MwStDivisor;
		betragSteuer = gesamtBrutto - gesamtNetto;
		
		
		//Ausgabe
		System.out.println(neueZeile);
		System.out.printf("Kiosk AliBaba's Höhle %n" + neueZeile + neueZeile);
		
		System.out.printf(
			"%4d \t %-10s \t %5.2f Euro %n",
			anzahl_1, artikel_1, preis_1
			);
			
		System.out.printf(
			"%4d \t %-10s \t %5.2f Euro %n",
			anzahl_2, artikel_2, preis_2
			);
			
		System.out.printf(
			"%4d \t %-10s \t %5.2f Euro %n" + neueZeile,
			anzahl_3, artikel_3, preis_3
			);
		
		System.out.printf(
			"Netto \t \t %5.2f Euro %n" +  
			"Umsatzsteuer \t %5.2f Euro %n" +
			"Brutto \t \t %5.2f Euro",
			gesamtNetto, betragSteuer, gesamtBrutto
			);
	}
}
