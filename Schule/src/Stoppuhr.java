
public class Stoppuhr {
	private long startzeit;
	private long endzeit;

	public Stoppuhr() {

	}

	public void starten() {
		this.startzeit = System.nanoTime();
	}

	public void stoppen() {
		this.endzeit = System.nanoTime();
		
	}

	public void reset() {
		    this.startzeit = System.nanoTime();
		    this.endzeit = this.startzeit;
		}
	

	public double getVergageneZeitInMillisekunden() {
		return (endzeit - startzeit)/1000000.0; 
	}
}
