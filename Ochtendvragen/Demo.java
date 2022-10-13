class Demo{   // OD
	final static public void main(String[] ab) {

		// Links bepaald waar we bij kunnen
		// Rechts bepaald wat we doen
		
		B c = new B();
		c.gaan();
		System.out.println("Alles goed gegaan");
	}
}

class A implements C {
	public B gaan() {
		System.out.println("Gaan in a!");
		return new B();
	}
}

//Override of overload?

class B extends A {
	public B gaan() {
		System.out.println("Gaan in b!");
		return null;
	}

}

interface C {
	int d = 5;
	B gaan() throws Exception;
}