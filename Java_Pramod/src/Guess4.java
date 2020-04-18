
public class Guess4 {

	public static void main(String[] args) 
	throws java.io.IOException{
		// TODO Auto-generated method stub
char ch,ignore,answer = 'K';
do {
	System.out.println("I'm thinking of a letter between A and Z. ");
	System.out.print("Can you guess it: ");
	ch = (char) System.in.read();
	do {
		ignore = (char) System.in.read();
	}while(ignore != '\n');
	if(ch == answer) System.out.println("Right");
	else {
		System.out.println("Wrong");
	}
}while(answer != ch);
	}

}
