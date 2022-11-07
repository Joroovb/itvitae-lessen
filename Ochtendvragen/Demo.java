class Demo{   //  WH
	final static public void main(String[] ab){
		lopen(new VB().gaan(true));
		System.out.println("einde");
	}
	static void lopen(double v){
		System.out.println("lopen1" + v);
	}
	static void lopen(int a){
		System.out.println("lopen2" + a);		
	}
}

class VB{
	int a = gaan(false);

	int gaan(boolean t){
		if(t){
			System.out.println("lopen3");
			return 7;
		}else{
			System.out.println("lopen5");
		}
		return 9;
	}

	float gaan(char w){
		System.out.println("lopen4");
		return 6.3f;
	}
}