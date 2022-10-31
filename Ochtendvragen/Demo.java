class Demo{   // PS
	final static public void main(String[] ab) { 
		System.out.println("start");
		AAA a = new QQQ();
		QQQ b = (QQQ)a;
		b.bbb();
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
	default void bbb() throws Exception {
		System.out.println("Ik doe het!!!");
	}
}

//private
//protected
//default
//public