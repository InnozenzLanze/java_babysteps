public class Konto {
	static int anzahl;
	String inhaber;
	double guthaben;
	int nummer;
	int blz;
	double limit;
	
	// Konstrutktor 1: Mit Guthaben
	Konto(String i, double g, int n, int b, double l) {
		inhaber = i;
		guthaben = g;
		nummer = n;
		blz = b;
		limit = l;
		anzahl++;
	}
	
	//Konstruktor 2: Kein Guthaben
	Konto(String i, int n, int b, double l) {
		inhaber = i;
		guthaben = 0.0;
		nummer = n;
		blz = b;
		limit = l;
		anzahl++;
	}
		
	
	//eine nicht-statische Methode
	// d.h. laesst sich nur aufrufen, wenn objekt erstellt und gefuellt
	public boolean abheben(double betrag) {
		if(betrag < 0) { 	//Abheben von negativen Betraegen nicht moeglich
		return false;
		}
		else if((guthaben - betrag) > limit) {
			guthaben = guthaben - betrag;
			return true; 	//Abheben erfolgreich
		}
		else {
			return false; 	//Limit ueberzogen
		}
	}	
}