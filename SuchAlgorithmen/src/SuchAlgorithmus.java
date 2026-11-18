public class SuchAlgorithmus {

	public void Suchalgoritmus() {

	}
	public long lineareSuche(long[] array, long gesuchteStelle) {
		for (int i = 0;i<array.length;i++) {
			if(array[i] == gesuchteStelle)return i;
		}
		return -1;
	}

	public long interpolationsSuche(long[] array, long gesuchteStelle) {

		int links = 0;
		int rechts = array.length - 1;

		while (links <= rechts && gesuchteStelle >= array[links] && gesuchteStelle <= array[rechts]) {

			if (array[links] == array[rechts]) {
				if (array[links] == gesuchteStelle) {
					return links;
				}
				return -1;
			}

			int stelle = links + (int)(((double)(gesuchteStelle - array[links]) *(rechts - links)) /(array[rechts] - array[links]));

			if (array[stelle] == gesuchteStelle) {
				return stelle;
			}

			if (array[stelle] < gesuchteStelle) {
				links = stelle + 1;
			} else {
				rechts = stelle - 1;
			}
		}

		return -1;
	}
}
