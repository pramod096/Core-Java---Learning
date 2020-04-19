interface NumericTest{
	boolean test(int n, int m);
	
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NumericTest isFactor =  (n , d) -> {
			if((n % d) == 0)
return true;
else 
	return false;
		};
		
		
		if(isFactor.test(10, 2))
			System.out.println("2 is a factor of 10");
		if(!isFactor.test(10, 3))
			System.out.println("3 is not a factor of 10");
		System.out.println();

		NumericTest lessThan = (f,g) -> (f < g);
		
		if(lessThan.test(10, 20))
			System.out.println("10 is less than 20");
		else
			System.out.println("10 is greater than 20");
			

	}

}
