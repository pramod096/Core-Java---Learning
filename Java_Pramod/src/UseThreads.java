class MyThread implements Runnable{
	String thrdName;
	
	MyThread(String name){
		thrdName = name;
	}
	
	public void run() {
		System.out.println(thrdName + "starting");
		try {
			for(int count  = 0; count < 10 ; count ++) {
				Thread.sleep(400);
				System.out.println("In " +thrdName + " , count is " + count);
			}
		}catch(InterruptedException exc) {
			System.out.println(thrdName + "Interrupted");
		}
		System.out.println(thrdName + " Terminating ");
	}
}
public class UseThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread mt = new MyThread("Child #1");

Thread newThread = new Thread(mt);
newThread.start();

for(int i = 0; i < 50; i++) {
	System.out.print(".");
	try {
		Thread.sleep(100);
	}catch(InterruptedException exc) {
		System.out.println("Main thread Interrupted");
	}
}
System.out.println("Main thread ending");
	}

}
