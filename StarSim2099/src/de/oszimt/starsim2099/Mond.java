package de.oszimt.starsim2099;

public class Mond extends Himmelskoerper {
private String erzArt;

public Mond() {}

public String getErzArt() {
	return erzArt;
}

public void setErzArt(String erzArt) {
	this.erzArt = erzArt;
}

public static char[][] getDarstellung() {
    char[][] moonShape = {
        { '\0', '/', '*', '*', '\\', '\0' },
        { '/', '*', '*', '*', '*', '\\' },
        { '|', '*', '*', '*', '*', '|' },
        { '\\', '*', '*', '*', '*', '/' },
        { '\0', '\\', '*', '*', '/', '\0' }
       
    };
    return moonShape;
}

}
