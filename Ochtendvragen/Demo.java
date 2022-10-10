class Demo{   // NM
	public static void main(String... ab){
		System.out.println("oei!");
		Andere dezelfde = new Andere();
		try {
			dezelfde.hup();
		} catch (Exception e) {
			System.out.println("Gaat fout!");
		}
		System.out.println("Einde");
	}
}

class Andere {
	void hup() throws Exception {
		throw new Error();
	}
}