package main;

public class FreiwilligerSchiedsrichter extends Mitglied {

    private int anzahlGepfiffeneSpiele;

    public FreiwilligerSchiedsrichter(String name, int telefonnummer, boolean beitragBezahlt, int anzahlGepfiffeneSpiele) {

        super(name, telefonnummer, beitragBezahlt);
        this.anzahlGepfiffeneSpiele = anzahlGepfiffeneSpiele;
    }

    public int getAnzahlGepfiffeneSpiele() {
        return anzahlGepfiffeneSpiele;
    }

    public void setAnzahlGepfiffeneSpiele(int anzahlGepfiffeneSpiele) {
        this.anzahlGepfiffeneSpiele = anzahlGepfiffeneSpiele;
    }
}