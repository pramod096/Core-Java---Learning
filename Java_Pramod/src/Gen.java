
public class Gen<T,O,M> {
T ob;
O s;

Gen(T o, O b){
	ob = o;
	s = b;
	
}

public static void main(String args[]) {
	Gen<Integer, String, Integer> ob;
	
	ob = new Gen<Integer,String, Integer>(20,"Hi");
	System.gc();
}
}

