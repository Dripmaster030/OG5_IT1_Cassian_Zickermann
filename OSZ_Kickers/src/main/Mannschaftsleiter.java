package main;

public class Mannschaftsleiter extends Spieler {
    private String mannschaftsname;
    private int rabattProzent;

    public Mannschaftsleiter(String name, int telefonnummer, boolean beitragBezahlt, String spielposition, int trikotnummer, String mannschaftsname, int rabattProzent) {

        super(name, telefonnummer, beitragBezahlt,spielposition, trikotnummer);
        this.mannschaftsname = mannschaftsname;
        this.rabattProzent = rabattProzent;
    }

    public String getMannschaftsname() {
        return mannschaftsname;
    }

    public void setMannschaftsname(String mannschaftsname) {
        this.mannschaftsname = mannschaftsname;
    }

    public int getRabattProzent() {
        return rabattProzent;
    }

    public void setRabattProzent(int rabattProzent) {
        this.rabattProzent = rabattProzent;
    }
}