public class Circuit {
	private int circuitLenght;
	private int numCars;
	private Car[] cars;
	
	
	public Circuit(int circuitLenght, int numCars, Car[] cars){
		this.circuitLenght = circuitLenght;
		this.numCars = numCars;
		this.cars = cars.clone(); 
	}
	
	public Car getCar(int i) {
		if (i >= 0 && i < numCars) {
			return cars[i];
		}
		else {
			return null;
		}
	}
	
	public void run() {
		while(hasFinished() == -1) {
			print(cars, numCars);
			for(int i = 0; i < numCars; i++) {
				cars[i].advance();
			}
			System.out.println();
		}
		print(cars, numCars);
		System.out.println( "Car " + cars[hasFinished()].getId() + " wins!!!");
	}
	
	public void print(Car[] cars, int numCars) {
		for(int i = 0; i < numCars; i++) {
		if (cars[i].getPos() >= circuitLenght) {
			cars[i].setPos(circuitLenght);
		}
		for(int j = 0; j <= circuitLenght; j++) {
			if (j == cars[i].getPos()) {
				System.out.print(cars[i]);
			}
			else {
				System.out.print("_");
			}
		}
		
		System.out.print("|");
		System.out.println();
		}
	}
	
	private int hasFinished() {
		int index = -1;
		
		for(int i = 0; i < numCars; i++) {
			if (cars[i].getPos() >= circuitLenght) {
				index = i;
			}
		}
		
		return index;
	}
}
