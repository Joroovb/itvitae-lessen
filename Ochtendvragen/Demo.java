class Demo{   // WE
	final static public void main(String[] ab){ 
		lopen(new VB().gaan(true));
		System.out.println("einde");
	}

	static void lopen(double v) {
		System.out.println("Lopen1");
	}

	static void lopen(int a) {
		System.out.println("Lopen2");
	}
}

class VB {
	int gaan(boolean t) {
		System.out.println("lopen3");
		return 7;
	}

	float gaan(char w) {
		System.out.println("Lopen4");
		return 6.3;
	}
}

