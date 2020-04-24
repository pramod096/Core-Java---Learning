import java.io.*;
public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i; 
DataInputStream fin = null;
FileOutputStream fout = null;

if(args.length != 2) {
	System.out.println(" Usage: CopyFile from to ");
	return;
}

try {
	fin = new DataInputStream(new FileInputStream(args[0]));
	fout = new FileOutputStream(args[1], true);
	
	do {
		i = fin.read();
		if(i != -1) fout.write(i);;
	}while(i != -1);
}catch(IOException exc) {
	System.out.println("I/O Error: " +exc);
}finally {
	try {
		if(fin != null) fin.close();
	}catch(IOException exc) {
		System.out.println("Error Closing input file");
	}
	try {
		if(fout != null) fout.close();
	}catch(IOException exc) {
		System.out.println("Error Closing Output File");
	}
}
	}

}
