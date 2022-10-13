class Demo{   // OB
	final static public void main(String[] ab) {

		// Links bepaald waar we bij kunnen
		// Rechts bepaald wat we doen
		
		B c = new B();
		c.gaan(5);
		System.out.println("Alles goed gegaan");
	}
}

class A implements C {
	public void gaan() {
		System.out.println("Gaan in a!");
	}
}

//Override of overload?

class B extends A {
	public void gaan() {
		System.out.println("Gaan in b!");
	}

}

interface C {
	int d = 5;
	void gaan();
}