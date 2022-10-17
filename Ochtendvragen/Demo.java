class Demo{   //OM
	final static public void main(String[] ab) {
		HereWeGo go = new Rechthoek();
		go.hup();
		go.gaan();
		System.out.println(go.a);
		Rond r = go;
		r.gaan();
		r.hup();
	}
}

abstract class HereWeGo {
	int a = 3;
	abstract void gaan();
	static void hup() {
		System.out.println("We gaan!");
	}
}

class Rond extends HereWeGo {
	int a = 4;
	void gaan() {
		System.out.println("Ronde wielen aan de bus");
	}
}

abstract class Vierkant extends Rond {
	int a = 4;
	abstract void gaan();
}

class Rechthoek extends Vierkant {
	int a = 6;
	void gaan() {
		System.out.println("We zijn in vierkant");
	}

	static void hup() {
		System.out.println("Rechthoek formatie!");
	}
}