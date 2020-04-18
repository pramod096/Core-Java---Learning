import java.io.IOException;

class ThrowsDemo {
public static char prompt(String str) throws IOException  {
	System.out.println(str + ":");
	return (char) System.in.read();
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		
			ch = prompt("Enter a letter");
		
		System.out.println("You pressed " +ch);
	}

}
