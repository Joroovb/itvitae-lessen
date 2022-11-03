class Demo{   // QE
	final static public void main(String[] ab){ 
		System.out.println("Start!");
		new WWW().worldWideWebben();
		System.out.println("We gaan door!");
	}
}

class WWW {
	void worldWideWebben() {
		try {
			new TTT().proberen();
		} catch (Exception e) {
			System.out.println("Gevangen!");
		} finally {
			System.out.println("in finally!");
		}
		System.out.println("Ik leef nog!");
	}
}

class TTT {
	void proberen() {
		throw new HereWeGoException();
	}
}

class HereWeGoException extends Error{}