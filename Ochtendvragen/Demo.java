class Demo{   // NM
	public static void main(String... ab) {
		// throw new Error();
		System.out.println("oei!");
		Andere dezelfde = new Andere();
		try {
			dezelfde.hup();
		} catch (Throwable e) {
			System.out.println("Gaat fout!");
		}
		System.out.println("Einde");
	}
}

class Andere {
	void hup() {
		throw new Error();
	}
}