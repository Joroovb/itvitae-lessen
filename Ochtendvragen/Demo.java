class Demo{   // NX
	final static public void main(String[] ab) {
		C c = new B();
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

}

interface C {
	int d;
	void gaan();
}