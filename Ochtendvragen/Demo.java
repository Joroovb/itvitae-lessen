class Demo { // SB
	public static void main(String... ab) {
		Kip kap = new Kip();
		kap.herewego();
		System.out.println("tok");
	}
}

class Kip {
	boolean boos;

	int herewego() throws NoEggsException {
		System.out.println("Is de kip boos?" + boos);
		return 9;
	}
}

Class NoEggsException extends RuntimeException {}