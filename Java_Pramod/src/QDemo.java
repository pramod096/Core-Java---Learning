class Queue{
	char q[];
	int putloc, getloc;
	
	Queue(int size){
		q = new char[size];
		putloc = getloc = 0;
	}
	
	void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" -- Queue is ful.");
			return;
		}
		q[putloc++] = ch;
	}
	
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty");
			return (char) 0;
		}
		return q[getloc++];
	}
}

class QDemo{
	public static void main(String args[]){
		int nums[] = {1,2,3,4,20,6,7,23,9,10};
	
		for(int x: nums) {
			
			System.out.println("Value is: " +x);
			x= x * 10;
			System.out.println("Value is: " +x);
		}
}
}