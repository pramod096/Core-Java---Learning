import java.io.*;
public class ReadBytes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
byte data[] = new byte[10];

System.out.println("Enter some characters");
System.in.read(data);
System.out.print("You Entered: ");
for(int i : data)
	System.out.print((char) i);
System.out.println();
char a = (char) System.in.read();
System.out.println("char a is" +a);

	}
	

}
