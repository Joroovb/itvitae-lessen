class Demo{   // PD
	final static public void main(String[] ab) { 
		System.out.println("start");
		AAA a = new QQQ();
		QQQ b = (QQQ)a;
		System.out.println("einde");
	}
}

class AAA{

}

class QQQ extends AAA{

}

interface JJJ{

}