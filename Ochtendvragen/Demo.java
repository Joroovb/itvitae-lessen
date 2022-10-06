class Demo { // SI
	public static void main(String... ab) {
		Kip kap = new Kip();
	
		try {
			kap.herewego();
		} catch (NoEggsException e) {
			System.out.println("Gaat fout");
		} catch (Exception e) {
			System.out.println("Ik ben een fout");
		} finally {
			System.out.println("We gaan door");
		}

		System.out.println("tok");
	}
}

class Kip {
	boolean boos;

	int herewego() throws NoEggsException {
		System.out.println("Is de kip boos?" + boos);
		throw new NoEggsException();
	}
}

class NoEggsException extends Error {}