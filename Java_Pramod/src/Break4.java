
public class Break4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i; 
for(i = 0; i<4; i++) {
	one: {
	two: {
	three: {
	System.out.println("\ni is " + i);
	if(i == 1) break one;
	if(i == 2) break two;
	if(i == 3) break three;
	System.out.println("wont");
}
System.out.println("after blk three");
}
System.out.println("after block two");
}
System.out.println("after block one");
}
System.out.println("after for");
o:for(int j =0; j<100; j++) {
	if(j == 10) break o;
	System.out.print(j);
}
	}

}
