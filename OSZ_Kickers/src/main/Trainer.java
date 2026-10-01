package main;

public class Trainer extends Mitglied {

    private char lizenzklasse;
    private int aufwandsentschaedigung;

    public Trainer() {
    }

    public char getLizenzklasse() {
        return lizenzklasse;
    }

    public void setLizenzklasse(char lizenzklasse) {
        this.lizenzklasse = lizenzklasse;
    }

    public int getAufwandsentschaedigung() {
        return aufwandsentschaedigung;
    }

    public void setAufwandsentschaedigung(int aufwandsentschaedigung) {
        this.aufwandsentschaedigung = aufwandsentschaedigung;
    }
}
