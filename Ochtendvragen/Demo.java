class Demo{   // NW
	final static public void main(String[] ab) {
		C c = new B();
		c.gaan();
		System.out.println("Alles goed gegaan");
	}
}

class A implements C {
	void gaan() {
		System.out.println("Gaan in a!");
	}
}

class B extends A {

}

interface C {
	void gaan();
}