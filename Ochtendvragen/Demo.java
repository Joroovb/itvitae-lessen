class Demo{   // PK
	final static public void main(String[] ab) { 
		System.out.println("start");
		AAA a = new QQQ();
		AAA b = (QQQ)a;
		b.aaa();
	}
}

class AAA implements JJJ {
	public void aaa() {
		System.out.println("in aaa");
		throw new RuntimeException();
	}

}

class QQQ extends AAA{
	public void aaa() {
		System.out.println("in qqq");
	}

}

class RRR {

}

interface JJJ {
	void aaa() throws Exception;
}

//private
//protected
//default
//public