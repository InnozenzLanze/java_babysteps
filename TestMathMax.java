/**
* Auswertung der Argumentliste von links nach rechts
* @version 1.0 	2025-10-02
* @author rmen source "Java ist auch eine Insel", christian ullenboom 
* Kapitel 2.7.6 Parameter, Argument und Wertübergabe
* "Was ist die Ausgabe folgender Zeilen?"
*/

public class TestMathMax {
	public static void main( String[] args ) {
		int i = 1;
		System.out.println( Math.max( i++, --i) ); // 1
		/*
		i++ = speichere in i 1, gib Ausdruck i = 1 aus, i = i + 1 (2)
		
		--i = speichere in i 1, i = i - 1 (0), gib Ausdruck i = 0 aus
		
		==> 1 > 0
		*/
	}
}