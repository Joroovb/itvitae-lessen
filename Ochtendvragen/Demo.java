class Demo{   // NO
	public static void main(String... ab) {
		System.out.println("oei!");
		Andere dezelfde = new Andere();
		try {
			dezelfde.hup();
		} catch (Throwable e) {
			System.out.println("Gaat fout!");
		} finally {
			System.out.println("Gered!");
		}
		System.out.println("Einde");
	}
}

class Andere implements H {
	void hup() {
		throw new Error();
	}

	Object gaan() {
		return new H();
	}
}

interface H {

}