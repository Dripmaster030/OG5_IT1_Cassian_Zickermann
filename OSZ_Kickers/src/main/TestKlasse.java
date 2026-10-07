package main;

public class TestKlasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t1 = new Trainer("Hans", 8518517, true, 'A', 250);
		Mannschaft m1 = new Mannschaft("OSZ_Kickers", "Bezirksliga", t1);
		Spieler s1 = new Spieler("Gero", 15151151, false, "Verteidiger", 0);
		Mannschaftsleiter ms1 = new Mannschaftsleiter("Tjarven", 5919180, false, "Stuermer", 7, m1.getName(), 3);
		FreiwilligerSchiedsrichter fs1 = new FreiwilligerSchiedsrichter("Cassian", 12345678, true, 100);
		Spiel sp1 = new Spiel(true, "08.10.2026", 3, 1);
		
		m1.addSpieler(s1);
		m1.addSpieler(ms1);
		m1.addSpiel(sp1);
		
	}

}