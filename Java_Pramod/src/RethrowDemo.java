class Rethrow{
	public static void genException() throws ArithmeticException {
		int numer[] = {4,8,16,32,64,128,256,512};
		int denom[] = {2,0,4,4,0,8};
		
		for(int i = 0; i<numer.length; i++) {
			try {
				System.out.println(numer[i]/denom[i]);
				
			}catch(ArithmeticException exc) {
				System.out.println("Can't divide by Zero!");
			}catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("No matching element found");
				throw exc;
			}
		}
	}
}
public class RethrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Rethrow.genException();
		}catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Fatal error");
			
		}

	}

}
