class Demo{   //  WU
	final static public void main(String[] ab){
		Fiets fiets = new Fiets();
		try {
			fiets.fietsen();			
		} catch (BelKapotException bk) {
			System.out.println("Bel heel erg kapot");
		} catch (Exception e) {
			System.out.println("bel kapot");
		} finally {
			System.out.println("a");
		}
		System.out.println("b");
	}
}

class Fiets {
	Bel bel = new Bel();

	void fietsen() throws BelKapotException {
		bel.bellen();
		System.out.println("Ik fiets!");
	}
}

class Bel {
	void bellen() throws Exception{
		System.out.println("Ik ben aan het bellen");
		throw new Exception();
	}
}

class BelKapotException extends Exception {}