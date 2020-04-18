class Stack{
	char q[];
	int putloc, getloc;
	
	Stack(int size){
		q = new char[size];
		putloc =0;
		getloc = 0;
	}
	
	void push(char ch) {
		if(putloc == q.length) {
			System.out.println(" - Queue is ful.");
			return;
		}
		q[putloc++] = ch;
	}
	
	char pop() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty");
			return (char) 0;
		}
		return q[getloc++];
	}
}

class StackDemo{
	public static void main(String args[]){
		
	Stack s = new Stack(10);
	s.push((char)20);
		
}
}