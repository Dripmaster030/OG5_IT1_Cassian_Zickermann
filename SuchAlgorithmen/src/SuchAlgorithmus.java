
public class SuchAlgorithmus {

	public void SuchAlgoritmus() {

	}
	public long lineareSuche(long[] array, long gesuchteStelle) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == gesuchteStelle) {
				return i;
			}
		}
		return -1;
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

	public long interpolationsSuche(long[] array, long gesuchteStelle) {

		int anfang = 0;
		int ende = array.length - 1;

		while (anfang <= ende &&gesuchteStelle >= array[anfang] &&gesuchteStelle <= array[ende]) {

			if (array[anfang] == array[ende]) {
				return array[anfang] == gesuchteStelle ? anfang : -1;
			}

			int stelle = (int) (anfang +(gesuchteStelle - array[anfang])* (ende - anfang)/ (array[ende] - array[anfang]));

			if (array[stelle] == gesuchteStelle) {
				return stelle;
			}

			if (array[stelle] < gesuchteStelle) {
				anfang = stelle + 1;
			} else {
				ende = stelle - 1;
			}
		}

		return -1;
	}

	public long fastSearch(long[] array, long gesuchteStelle) {

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

		return -1;
	}
}
