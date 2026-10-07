package main;

public class Spieler extends Mitglied {
	private String spielposition;
	private int trikotnummer;
	private Mannschaft mannschaft;

	public Spieler(String name, int telefonnummer, boolean beitragBezahlt, String spielposition, int trikotnummer) {

		super(name, telefonnummer, beitragBezahlt);
		this.spielposition = spielposition;
		this.trikotnummer = trikotnummer;
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

	public Mannschaft getMannschaft() {
		return mannschaft;
	}

	public void setMannschaft(Mannschaft mannschaft) {
		this.mannschaft = mannschaft;
	}
}