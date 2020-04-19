class A{
	static int x = 20;
	int i,j;
	A(int a, int b){
		i = a;
		j = b;
	}
	
	 void show() {
		 try {
		System.out.println("i");
	}catch(ArrayIndexOutOfBoundsException exte) {
		
	}
}
}
	class B extends A{
		int k;
		 B(int a, int b, int c){
			 super(a,b);
			 k = c;
		 }
		 
		 void show() {
			 System.out.print("k");
		 }
		 
	}
	
public class Override {
protected int x = 30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B subOb = new B(1 , 2 , 3);
		A subO = new A(1,2);
		A subRef;
		
		subRef = subOb;
		
		subRef.show();
		
		System.out.println(B.x);
		subO = subOb;
		subO.show();
subO.show();
	}

}
