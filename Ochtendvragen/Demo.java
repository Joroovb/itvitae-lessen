class Demo { // SE
	public static void main(String... ab) {
		Kip kap = new Kip();
		try {
			int a = 9;
			kap.herewego();
		} catch (Exception e) {
			a = 7;
			System.out.println("Gaat fout");
		}

		System.out.println("tok" + a);
	}
}

class Kip {
	boolean boos;

	void herewego() throws NoEggsException {
		System.out.println("Is de kip boos?" + boos);
		throw new NoEggsException();
	}
}

class NoEggsException extends Exception {}