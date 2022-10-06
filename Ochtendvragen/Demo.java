class Demo { // AB
	public static void main(String... ab) {
		Q q = new E(); 
// Links bepaald waar je bij kan
// Rechts bepaald wat je doet
		L l = new E();
		l.i();
		System.out.println("Let's go!");

		Drinkbaar k = new Koffie();
		Drinkbaar w = new Water();

		// generiek.    // specifiek
		Drinkbaar[] d = {new Water(), new Koffie(), new Cola()};
	}
}

class Q {}

class E extends Q implements L {
	public void i() {
		System.out.println("In E de I");
	}
}

interface L {
	void i();
}

interface Drinkbaar {}

class Water implements Drinkbaar {}

class Cola implements Drinkbaar {}

class Koffie implements Drinkbaar {}