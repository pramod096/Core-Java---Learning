enum TrafficLightColor{
	RED, GREEN, YELLOW
}

class TrafficLightSimulator implements Runnable{
	
	private TrafficLightColor Tlc;
	private boolean stop = false;
	private boolean changed = false;
	
	TrafficLightSimulator(TrafficLightColor init){
		Tlc = init;
	}
	
	TrafficLightSimulator(){
		Tlc = TrafficLightColor.RED;
	}
	
	public void run() {
		while(!stop) {
			try {
				switch(Tlc) {
				case GREEN:
					Thread.sleep(10000);
					break;
				case YELLOW:
					Thread.sleep(2000);
					break;
				case RED:
					Thread.sleep(12000);
					break;
				}
			}catch(InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}
	
	synchronized void changeColor() {
		switch(Tlc) {
		case RED:
			Tlc = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			Tlc = TrafficLightColor.RED;
			break;
		case GREEN:
			Tlc = TrafficLightColor.YELLOW;
		}
		changed = true;
		notify();
	}
	
	synchronized void waitForChange() {
		try {
			while(!changed)
				wait();
				changed = false;
		}catch(InterruptedException exe) {
			System.out.println(exe);
		}
	}
	
	synchronized TrafficLightColor getColor() {
		return Tlc;
	}
	
	synchronized void cancel() {
		stop = true;
	}
}

public class TrafficLightDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
		Thread thrd = new Thread(t1);
		thrd.start();
		
		for(int i = 0; i < 3; i ++) {
			System.out.println(t1.getColor());
			t1.waitForChange();
		}
t1.cancel();
	}

}
