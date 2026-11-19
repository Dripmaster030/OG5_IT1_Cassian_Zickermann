
import java.util.Random;

public class TestProgramm {

	public static long[] getSortedList(int laenge){
		Random rand = new Random(111111);
		long[] zahlenliste = new long[laenge];
		long naechsteZahl = 0;
		
		for(int i = 0; i < laenge; i++){
			naechsteZahl += rand.nextInt(3)+1;
			zahlenliste[i] = naechsteZahl;
		}
		
		return zahlenliste;
	}
	
	public static void main(String[] args){
		final int ANZAHL = 20000000; //20.000.000
		
		long[] a = getSortedList(ANZAHL);
		long gesuchteZahl = a[ANZAHL-1];
		
		long time = System.currentTimeMillis();
		
		for(int i = 0; i < a.length; i++)
			if(a[i] == gesuchteZahl)
				System.out.println(i);
		
		System.out.println(System.currentTimeMillis() - time + "ms");
		
		System.out.println(a[77]);
		
		long suchZahl = 158;
	
		SuchAlgorithmus s1 = new SuchAlgorithmus();
		long z1 = s1.lineareSuche(a, suchZahl);
		System.out.println(z1);
		System.out.println(System.currentTimeMillis() - time + "ms");
		z1 = s1.interpolationsSuche(a, suchZahl);
		System.out.println(z1);
		System.out.println(System.currentTimeMillis() - time + "ms");
		z1 = s1.fastSearch(a, suchZahl);
		System.out.println(z1);
		System.out.println(System.currentTimeMillis() - time + "ms");
	}
	
}