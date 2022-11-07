class Demo{   //  XC
	final static public void main(String[] ab){
		int a = 34;
		char b = (char) a;
		b++;
		System.out.println(a);

		Trial q = new Trial();
		Trial w = q;

		q.a++;

		System.out.println(w.b);
		System.out.println("Einde");
	}
}

class Trial {
	int a = 22;
	static b = abc();

	int abc() {
		System.out.println("Doet tie het?");
		return a++
	}
}
