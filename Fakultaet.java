/**
* Berechnung einer Fakultät
* Thema Rekursive Algorithmen
*/
import java.util.*;

public class Fakultaet {
	public static void main(String[] args) {
		
		//Deklaration
		Scanner eingabe = new Scanner (System.in);
		int n;
		int ergebnis;
		
		//Eingabe
		System.out.println("Berechnung einer Fakultät");
		System.out.print("Bitte geben Sie eine Ganzzahl ein: ");
		n = eingabe.nextInt();
		ergebnis = fakultaet(n);
		System.out.print("Ergebnis: " + ergebnis);
		
	}
	//Verarbeitung
	public static int fakultaet(int n) {
		if (n == 0) 	
		{	//Basisfall: 0!=1
			return 1;
		}
		else
		{	//Rekursiver Fall: n! = n* (n -1)! für n > 0
			return fakultaet(n -1) * n;
		}
	}
}