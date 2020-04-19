interface NumericTest{
	boolean test(int n, int m);
	
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericTest isFactor = (n , d) -> (n % d ) == 0;
		
		if(isFactor.test(10, 4))
			System.out.println("4 is a factor of 10");
		if(!isFactor.test(10, 3))
			System.out.println("3 is not a factor of 10");
		System.out.println();

		NumericTest lessThan = (f,g) -> (f < g);
		
		if(lessThan.test(10, 20))
			System.out.println("10 is less than 2");
		else
			System.out.println("10 is greater than 20");
			

	}

}
