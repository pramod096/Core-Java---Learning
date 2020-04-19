
public class hello {
	int[] a = new int[3];
	hello(int ...v){
		for(int i = 0 ; i < v.length ; i++)
		a = v;
	}
public static void main(String args[]) {
	System.out.println(" hello ");
	String s = new String("Pramod");
	for(int i = s.length() - 1 ; i >= 0; i--) {
		System.out.print(s.charAt(i));
	}
}
}
