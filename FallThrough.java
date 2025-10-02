/**
* SimpleYearMonthParser zum Demonstrieren vom Fall-through.
* @version 1.0 	2025-09-25
* @author rmen source "Java ist auch eine Insel", christian ullenboom 
* Kapitel 2.5.4 Die switch-Anweisung bietet eine Alternative
* "Was sollte der Leser von diesem Beispiel mitnehmen? 
* Eigentlich nur Kopfschütteln für eine schwer zu verstehende Lösung."
*/

public class FallThrough {
	public static void main( String[] args ) {
		//String date = "20 04";
		String input = javax.swing.JOptionPane.showInputDialog( "Eingabe" );
		String date = input;
		int month = 0, year = 0;
		java.util.Scanner scanner = new java.util.Scanner( date );
		
		switch( date.length() ) {
			case 5:				//YY MM
				year = 2000; 	//Initialisierung mit 2000 ==> case 7
			
			//Fall-through
			
			case 7: 			//YYYY MM bzw. 2000+YY MM
				year += scanner.nextInt(); 
			
			//Fall-through
			
			case 2:				//MM
				month = scanner.nextInt();
				if( month > 12 ) {
					System.err.println( "ungültige Monatsangabe");
				}
				else {
					//
				}
				if( year == 0 ) {
						year=java.time.Year.now().getValue();
					}
					else {
						//
					}
				break;	
			
			default:
				System.err.println( "Falsches Format" );
				break;
		}
		
		System.out.println( "Monat=" + month + ", Jahr=" + year );
	}
}