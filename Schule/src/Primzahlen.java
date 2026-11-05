
public class Primzahlen {


	public void Primzahl() {

	}

	public boolean isPrim(long zahl) {
		for(int i = 2;i < Math.sqrt(zahl);i++) {
			if(zahl % i == 0 ) {
				return false;
			}

		}
		return true;  
	}
}


