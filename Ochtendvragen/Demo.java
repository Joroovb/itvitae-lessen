class Demo{   // NT
	//java Demo a b c d e
	final static public void main(String[] ab) {
		System.out.println("OK" + ab[3]);
		oei();
	}

	void oei(int... daargaanwe) {
		System.out.println(daargaanwe[daargaanwe.length - 1]);
	}
}

