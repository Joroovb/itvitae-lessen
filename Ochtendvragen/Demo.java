class Demo{   // NA
	public static void main(String... ab){
		System.out.println("Let's go!");
		beginnen();
	}

	void beginnen() {
		Go no = new Go();
		Go so = new Go();
		no.a = 12;
		System.out.println(so.a);
	}
}

class Go {
	static int a = 2;
}