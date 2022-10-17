class Demo{   // OH
	final static public void main(String[] ab) {
		// We mogen geen instantie maken van
		// abstracte class
		HereWeGo go = new HereWeGo();
		go.gaan();
	}
}

abstract class HereWeGo {
// Als je een abstracte methode hebt, 
//moet de class ook abstract zijn
	abstract void gaan();
}