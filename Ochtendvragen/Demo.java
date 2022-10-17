class Demo{   //OL
	final static public void main(String[] ab) {
		// We mogen geen instantie maken van
		// abstracte class
		HereWeGo go = new Rechthoek();
		go.hup();
		go.gaan();

		Rond r = new Rond();
		r.gaan();
	}
}

abstract class HereWeGo {
// Als je een abstracte methode hebt, 
//moet de class ook abstract zijn
	abstract void gaan();

	static void hup() {
		System.out.println("We gaan!");
	}
}

class Rond extends HereWeGo {
	void gaan() {
		System.out.println("Ronde wielen aan de bus");
	}
}

abstract class Vierkant extends Rond {

}

class Rechthoek extends Vierkant {

	static void hup() {
		System.out.println("Rechthoek formatie!");
	}

}