/**
* float und double
* @version 1.0 	2025-09-22
* @author rmen
"Java ist auch eine Insel", Rheinwerk-Verlag, Kapitel 2.3.6
*/
public class AusgabeFloatDouble {
	public static void main(String[] args) {
		System.out.println( 20000000000F == 20000000000F+1 );			//true
		System.out.println( 20000000000D == 20000000000D+1 );			//false
		System.out.println( Float.toHexString( 20000000000F ) ); 		//0x1.2a05f2p34
		System.out.println( Float.toHexString( 20000000000F + 1F ) ); 	//0x1.2a05f2p34
		System.out.println( Double.toHexString( 20000000000D ) ); 		//0x1.2a05f2p34
		System.out.println( Double.toHexString( 20000000000D + 1D ) );	//0x1.2a05f2004p34
	}
}