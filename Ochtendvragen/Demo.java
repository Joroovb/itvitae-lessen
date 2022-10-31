class Demo{   // PI
	final static public void main(String[] ab) { 
		System.out.println("start");
		AAA a = new QQQ();
		AAA b = (QQQ)a;
		System.out.println("einde");
	}
}

class AAA{
	void aaa() {
		System.out.println("in aaa");
		throw new Exception();
	}

}

class QQQ extends AAA{
	void aaa() {
		System.out.println("in qqq");
	}

}

class RRR {

}

interface JJJ {

}