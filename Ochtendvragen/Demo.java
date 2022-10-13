class Demo{   // NY
	final static public void main(String[] ab) {
		A c = new B();
		c.gaan();
		System.out.println("Alles goed gegaan");
	}
}

class A implements C {
	public void gaan() {
		System.out.println("Gaan in a!");
	}
}

class B extends A {
	public void gaan(int a) {
		System.out.println("Gaan in b!");
	}

}

interface C {
	int d = 5;
	void gaan();
}