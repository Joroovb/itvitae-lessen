class Demo{   //  WT
	final static public void main(String[] ab){
		Fiets fiets = new Fiets();
		try {
			fiets.fietsen();			
		} catch (Exception e) {
			System.out.print("bel kapot");
		} finally {
			System.out.print("a");
		}
		System.out.print("b");
	}
}

class Fiets {
	Bel bel = new Bel();

	void fietsen() throws Exception {
		bel.bellen();
		System.out.print("Ik fiets!");
	}
}

class Bel {
	void bellen() throws Exception{
		System.out.print("Ik ben aan het bellen");
		throw new Exception();
	}
}