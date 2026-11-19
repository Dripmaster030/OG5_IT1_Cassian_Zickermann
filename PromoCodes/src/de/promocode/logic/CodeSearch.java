package de.promocode.logic;
import java.util.Random;
public class CodeSearch {

	public static int NOT_FOUND = -1;

	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list
	 *            Liste der Codes im Long-Format
	 * @param searchValue
	 *            Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	public static int findPromoCode(long[] list, long searchValue) {
		/*for (int i = 0; i < list.length - 1; i++) {
			if (list[i] == searchValue)
				return i;
			
		}*/
		int ergebniss = (int)fastSearch(list, searchValue);
		return ergebniss;
	}
		public static long fastSearch(long[] array, long gesuchteStelle) {

			long stelle = interpolation(array, gesuchteStelle);

			if (stelle == -1) {
				return -1;
			}

			int anfang = (int) stelle;
			int ende = array.length - 1;

			while (anfang <= ende) {

				int mitte = anfang + (ende - anfang) / 2;

				if (array[mitte] == gesuchteStelle) {
					return mitte;
				}

				if (array[mitte] < gesuchteStelle) {
					anfang = mitte + 1;
				} else {
					ende = mitte - 1;
				}
			}
		

		return NOT_FOUND;
	
	}
	
		public static long interpolation(long[] array, long gesuchteStelle) {

			int anfang = 0;
			int ende = array.length - 1;

			while (anfang <= ende &&gesuchteStelle >= array[anfang] &&gesuchteStelle <= array[ende]) {

				if (array[anfang] == array[ende]) {
					if (array[anfang] == gesuchteStelle) {
						return anfang;
					}
					return -1;
				}

				int stelle = (int) (anfang +(gesuchteStelle - array[anfang])* (ende - anfang)/ (array[ende] - array[anfang]));

				return stelle;
			}

			return -1;
		}
	
	
	
	
}
