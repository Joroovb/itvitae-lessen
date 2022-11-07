class Demo{   //  WO
	final static public void main(String[] ab){
		Fiets fiets = new Fiets();
		fiets.fietsen();
	}
}

class Fiets {
	Bel bel;

	void fietsen() {
		bel.bellen();
		System.out.print("Ik fiets!");
	}
}

class Bel {
	void bellen() {
		System.out.print("Ik ben aan het bellen");
		throw new RuntimeException();
	}
}