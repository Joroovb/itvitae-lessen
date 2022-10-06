class Demo { // AB
	public static void main(String... ab) {
		Q q = new E();
		L l = new E();
		q.i();
		System.out.println("Let's go!");
	}
}

class Q {}

class E extends Q implements L {
	void i() {
		System.out.println("In E de I");
	}
}

interface L {
	void i();
}