class Demo{   // QD
	final static public void main(String[] ab){ 
		new WWW().worldWideWebben();
		System.out.println("We gaan door!");
	}
}

class WWW {
	void worldWideWebben() {
		try {
			new TTT.proberen();
		} catch (Exception e) {
			System.out.println("Gevangen!");
		} finally {
			return;
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