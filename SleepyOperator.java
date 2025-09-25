/**
* float und double
* @version 1.0 	2025-09-24
* @author rmen source "Java ist auch eine Insel", christian ullenboom
* "Java ist auch eine Insel", Rheinwerk-Verlag, 
* Kapitel 2.4.5 "Präfix- oder Postfix-Inkrement und -Dekrement
*/

public class SleepyOperator {
	public static void main( String[] args) {
		int i = 0;
		System.out.println( "Initialisierung: i =" + (i) );
		System.out.println();
		
		System.out.println( "Deklaration: i =" + (i = 5) );
		System.out.println();	
		
		System.out.println( "Operation 1: i += 1 ; i =" + (i += 1) ); //erst manipulieren, dann auflösen
		System.out.println( "Nach Operation: i =" + (i) );		
		System.out.println();
		
		System.out.println( "Operation 2: i ++ ; i =" + (i ++) ); //erst auflösen, dann manipulieren
		System.out.println( "Nach Operation: i =" + i );
		System.out.println();
		
		System.out.println( "Operation 3: ++ i ; i =" + (++ i) ); //erst manipulieren, dann auflösen
		System.out.println( "Nach Operation: i =" + i );
		System.out.println();
		
		System.out.println( "SleepyOperation: i -=- i ; i =" + (i -=- i) );
		//	i -=- i;
		//	i -= -i; speichere in i die Differenz von i und -i
		//	i -=  X;
		//	i = i - X; für X = -i:
		//	i = i - -i;
		//	i = i + i; == i *= 2;
		System.out.println( "Nach Operation: i =" + (i) );
		System.out.println();
	}
}	