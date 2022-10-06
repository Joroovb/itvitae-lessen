class Demo { // SD
	public static void main(String... ab) {
		Kip kap = new Kip();
		try {
			kap.herewego();
		} catch (Exception e) {
			System.out.println("Gaat fout");
		}

		System.out.println("tok");
	}
}

class Kip {
	boolean boos;

	int herewego() throws NoEggsException {
		System.out.println("Is de kip boos?" + boos);
		throw new NoEggsException();
		return 9;
	}
}

class NoEggsException extends Exception {}