class Vehicle{
	private int passengers; 
	private int fuelcap;
	private int mpg;
	
	Vehicle(int p, int f, int m){
		passengers = p;
		fuelcap = f;
		mpg = m;
		
	}
	
	int range() {
		return mpg * fuelcap;
	}
	
	double fuelneeded(int miles ) {
		return (double) miles/mpg;
	}
	
	int getpassengers() {
		return passengers;
	}
	
	void setPassengers(int p) {
		passengers = p;
	}
	
	int getFuelcap() {
		return fuelcap;
	}
	
	void setFuelcap(int f) {
		fuelcap = f;
	}
	
	int getMpg() {
		return mpg;
	}
	
	void setMpg(int m) {
		mpg = m;
	}
}

class Truck extends Vehicle{
	private int cargocap;
	
	Truck(int p, int f, int m, int c){
		super(p, f, m);
		cargocap = c;
	}
	
	int getCargo() {
		return cargocap;
	}
	
	void putCargo(int c) {
	cargocap = c;
	}
}
public class TruckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Truck semi = new Truck(2, 200, 7, 4400);
			System.out.println("Semi can carry " + semi.getCargo() + " punds ");
			System.out.println("Semi can carry " + semi.getCargo() + " punds");
			System.out.println("Semi can carry " + semi.getCargo() + " punds");
			System.out.println("Semi can carry " + semi.getCargo() + " punds");
	}

}
