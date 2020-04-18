
public class period {

	public static void main(String[] args)  throws java.io.IOException{
		// TODO Auto-generated method stub
char period,ignore;
int space_count = 0/2;
System.out.println("Enter any no. of characters");
do
{
	period = (char) System.in.read();
	if(period == ' ')
		space_count++;
	do {
		ignore = (char) System.in.read();
	}while(ignore != '\n');
}while(period != '.');
System.out.println("Total number of spaces = " +space_count);
	}

}
