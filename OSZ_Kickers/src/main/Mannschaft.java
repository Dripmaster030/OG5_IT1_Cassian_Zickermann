package main;

public class Mannschaft {

	private String name;
	private String spielklasse;
	private Trainer trainer;
	private Spieler[] spieler;
	private Spiel[] spiel;
	private int anzahlSpieler;
	private int anzahlSpiele;

	public Mannschaft(String name, String spielklasse, Trainer trainer) {
		this.name = name;
		this.spielklasse = spielklasse;
		this.trainer = trainer;
		spieler = new Spieler[20];
		spiel = new Spiel[10];
	}

	public void addSpieler(Spieler neuerSpieler) {

		if (this.anzahlSpieler < this.spieler.length) {

			spieler[anzahlSpieler] = neuerSpieler;
			anzahlSpieler++;

			neuerSpieler.setMannschaft(this);
		}
	}

	public void addSpiel(Spiel neuesSpiel) {

		if (this.anzahlSpiele < this.spiel.length) {

			spiel[anzahlSpiele] = neuesSpiel;
			anzahlSpiele++;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpielklasse() {
		return spielklasse;
	}

	public void setSpielklasse(String spielklasse) {
		this.spielklasse = spielklasse;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Spieler[] getSpieler() {
		return spieler;
	}

	public void setSpieler(Spieler[] spieler) {
		this.spieler = spieler;
	}

	public Spiel[] getSpiel() {
		return spiel;
	}

	public void setSpiel(Spiel[] spiel) {
		this.spiel = spiel;
	}

	public int getAnzahlSpieler() {
		return anzahlSpieler;
	}

	public void setAnzahlSpieler(int anzahlSpieler) {
		this.anzahlSpieler = anzahlSpieler;
	}

	public int getAnzahlSpiele() {
		return anzahlSpiele;
	}

	public void setAnzahlSpiele(int anzahlSpiele) {
		this.anzahlSpiele = anzahlSpiele;
	}

	

}