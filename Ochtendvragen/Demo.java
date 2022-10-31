class Demo{   // PF
	final static public void main(String[] ab) { 
		System.out.println("start");
		AAA a = new QQQ();
		JJJ b = (JJJ)a;
		System.out.println("einde");
	}
}

class AAA{

}

class QQQ extends AAA{

}

interface JJJ{

}