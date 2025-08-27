import java.util.*;

public class eingaben {
	public static void main(String[] args) {
		
		//Deklaration
		Scanner taste = new Scanner (System.in);
		short ganzzahl1;
		int ganzzahl2;
		long ganzzahl3;
		float kommazahl1; 
		double kommazahl2;
		String text;
		
		//Eingabe
		System.out.println("Bitte geben Sie eine ganze Zahl von 0 - 32.767 ein.");
		ganzzahl1 = taste.nextShort();
		
		System.out.println("Bitte geben Sie eine ganze Zahl von 0 - 2.147.483.647 ein.");
		ganzzahl2 = taste.nextInt();
		
		System.out.println("Bitte geben Sie eine ganze Zahl von 0 - 9.223.372.036.854.775.807 ein.");
		ganzzahl3 = taste.nextLong();
		
		System.out.println("Bitte geben Sie eine Fließkommazahl mit maximal 6 Nachkommastellen ein.");
		kommazahl1 = taste.nextFloat();
		
		System.out.println("Bitte geben Sie eine Fließkommazahl mit maximal 13 Nachkommastellen ein.");
		kommazahl2 = taste.nextDouble();
		
		System.out.println("Bitte geben Sie einen Text ein.");
		text = taste.next();
		
		//Ausgabe
		System.out.println("------- Danke.");
		System.out.println("Ihre Eingaben:");
		System.out.println(ganzzahl1);
		System.out.println(ganzzahl2);
		System.out.println(ganzzahl3);
		System.out.println(kommazahl1);
		System.out.println(kommazahl2);
		System.out.println(text);		
	}
}