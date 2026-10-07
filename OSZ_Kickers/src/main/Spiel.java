package main;

public class Spiel {

    private boolean heimspiel;
    private String datum;
    private int heimTore;
    private int gastTore;

    public Spiel(boolean heimspiel, String datum, int heimTore, int gastTore) {
        this.heimspiel = heimspiel;
        this.datum = datum;
        this.heimTore = heimTore;
        this.gastTore = gastTore;
    }

    public boolean getHeimspiel() {
        return heimspiel;
    }

    public void setHeimspiel(boolean heimspiel) {
        this.heimspiel = heimspiel;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getHeimTore() {
        return heimTore;
    }

    public void setHeimTore(int heimTore) {
        this.heimTore = heimTore;
    }

    public int getGastTore() {
        return gastTore;
    }

    public void setGastTore(int gastTore) {
        this.gastTore = gastTore;
    }
}