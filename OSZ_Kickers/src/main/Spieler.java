package main;
public class Spieler extends Mitglied {
	

    private String spielposition;
    private int trikotnummer;
    
    public Spieler(String name, int telefonnummer, boolean beitragBezahlt, String name, int telefonnummer, boolean beitragBezahlt) {
    	
		super(name, telefonnummer, beitragBezahlt);
		// TODO Auto-generated constructor stub
	}
	public String getSpielposition() {
        return spielposition;
    }

    public void setSpielposition(String spielposition) {
        this.spielposition = spielposition;
    }

    public int getTrikotnummer() {
        return trikotnummer;
    }

    public void setTrikotnummer(int trikotnummer) {
        this.trikotnummer = trikotnummer;
    }
}