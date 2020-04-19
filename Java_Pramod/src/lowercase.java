
public class lowercase {

	public static void main(String[] args) throws java.io.IOException{
		char period,ignore;
		int changes = 0;
		System.out.println("Enter lower case or  upper case letters\nPress \".\" to quit");
		do
		{
			period = (char) System.in.read();
			if(period >= 65 && period <= 90) {
				period = (char) (period + 32);
				System.out.println(period);
				changes++;
			}
			else if(period >=97 && period <=122) {
				period = (char) (period - 32);
				System.out.println(period);
				changes++;
			}
			else
				System.out.println(period);
			do {
				ignore = (char) System.in.read();
			}while(ignore != '\n');
		}while(period != '.');
		System.out.println("Total number of changes = " +changes);
			}

		}