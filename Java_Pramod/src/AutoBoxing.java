@interface MyAnno{
	String str();
	int val();
}
public class AutoBoxing {
	@MyAnno(str = " ", val = 0)
	public static void abc(Integer z) {
		z = z+1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Integer a = 20;
abc(a);

System.out.println(a);

	}

}
