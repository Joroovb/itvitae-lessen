class Demo{   // NB
	public static void main(String... ab){
		System.out.println("Let's go!");
		new Demo().beginnen();
	}

	void beginnen() {
		Go no = new Go();
		Go so = new Go();
		no.a = 15;
		System.out.println(so.a);
	}
}

class Go {
	static int a = 5;
}