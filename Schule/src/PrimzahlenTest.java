import java.util.*;
public class PrimzahlenTest {

	public static void main(String[] args) {


		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		Stoppuhr s1 = new Stoppuhr();
		Primzahlen p1 = new Primzahlen();
		long l = scan.nextLong();
		s1.starten();
		boolean b = p1.isPrim(l);
		s1.stoppen();
		double sek = s1.getVergageneZeitInMillisekunden();
		s1.reset();
		System.out.println(sek);
		System.out.println(b);
		
	}
}
