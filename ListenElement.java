public class ListenElement {
	Inhalt inhalt;  //Object obj;
	ListenElement nachfolger; //nextElem
	
	public ListenElement(Inhalt inhalt) { 	//Konstruktor
		this.inhalt = inhalt;
		nachfolger = null;	
	}
	
	public void setNachfolger(ListenElement nachfolger) {
		this.nachfolger = nachfolger;
	}
	
	public ListenElement getNachfolger() {
		return nachfolger;
	}
	
	public Inhalt getInhalt() { //Object getObj()
		return inhalt;			//return obj;
	}
}