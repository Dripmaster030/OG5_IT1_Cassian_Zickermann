package main;

public abstract class Mitglied {

    private String name;
    private int telefonnummer;
    private boolean beitragBezahlt;

    public Mitglied(String name, int telefonnummer, boolean beitragBezahlt) {
        this.name = name;
        this.telefonnummer = telefonnummer;
        this.beitragBezahlt = beitragBezahlt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public boolean istBeitragBezahlt() {
        return beitragBezahlt;
    }

    public void setBeitragBezahlt(boolean beitragBezahlt) {
        this.beitragBezahlt = beitragBezahlt;
    }
}