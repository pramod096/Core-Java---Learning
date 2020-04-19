
public class InchesToMeters {
	public static void main(String args[]) {
float inches;
for(inches =1; inches <= 144f; inches++) {
	System.out.println(+inches+ "in  meters is : " +inches/39.37);
	if(inches%12 == 0f)
		System.out.println();
}
System.out.print(inches);
}
}
