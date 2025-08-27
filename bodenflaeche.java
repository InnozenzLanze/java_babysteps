import java.util.*;

public class bodenflaeche {
	public static void main(String[] args) {
		
		//Deklaration
		Scanner raum = new Scanner (System.in);
		double laenge;
		double breite;
		double flaeche;
		
		//Eingaben
		System.out.print("Bitte geben Sie eine Raumlänge an: ");
		laenge = raum.nextDouble();
		
		System.out.print("Bitte geben Sie eine Raumbreite an: ");
		breite = raum.nextDouble();
		
		//Verarbeiteung
		flaeche = laenge * breite;
		
		//Ausgabe
		System.out.println("Vielen Dank.");
		System.out.println("Die Fläche des Raumes beträgt " + flaeche + "m^2");
	}
}