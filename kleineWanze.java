import java.util.*;

public class kleineWanze {
	public static void main(String[] args) {
		//Deklaration
		Scanner swap = new Scanner(System.in);
		String mauer = "Mauer";
		String lauer = "Lauer";
		String wanze = "Wanze";
		
		//Anweisung und Eingabe
		System.out.println("Bitte geben Sie drei Wörter ein.");
		System.out.print("1. Wort: ");
		mauer = swap.next();
		System.out.print("2. Wort: ");
		lauer = swap.next();
		System.out.print("3. Wort: ");
		wanze = swap.next();		
		
		//Ausgabe
		System.out.println("Auf der " + mauer + ", auf der " + lauer);
		System.out.println("Sitzt 'ne kleine " + wanze);
	}
}