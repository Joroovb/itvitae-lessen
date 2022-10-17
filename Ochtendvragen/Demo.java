class Demo{   //OI
	final static public void main(String[] ab) {
		// We mogen geen instantie maken van
		// abstracte class
		HereWeGo go = null;
		go.hup();
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