class Demo{   // NF
	public static void main(String... ab){
		System.out.println("Let's go!");
		new Demo().beginnen();
	}

	void beginnen() {
		Go no = new Go();
		Go so = new Go();
		no.a = 18;
		no.hoi();
		System.out.println(so.a);
	}
}

class Go {
	static int a = 3;
	
	static void hoi() {
		int a = 7; // shadowed
		System.out.println(a);
		this.a = a;
	}
}