class Demo { // AB
	public static void main(String... ab) {
		Q q = new E(); 
// Links bepaald waar je bij kan
// Rechts bepaald wat je doet
		L l = new E();
		E e = new E();
		l.i();

		// Doosje	// Wat er in moet
		// Gat		// blokje
		// Generiek // specifiek
		Meeuw m = new Meeuw();
		Dier d = new Meeuw();
		Dier dd = new Dier();
		Meeuw mm = new Dier();	
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

class Dier {}

class Meeuw extends Dier {}
