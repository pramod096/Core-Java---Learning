class MyClass{
	private int alpha;
	public int beta;
	int gamma;
	
	 void setAlpha(int a) {
		alpha = a;
	}
	
	int getAlpha(){
		return alpha;
	}
}
public class AccessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyClass ob = new MyClass();
ob.setAlpha(-99);
System.out.println(ob.getAlpha());
	}

}
