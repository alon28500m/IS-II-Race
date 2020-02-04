public class Circuit {
	private int circuitLenght;
	private int numCars;
	private Car[] cars;
	
	
	public Circuit(int circuitLenght, int numCars, Car[] cars){
		this.circuitLenght = circuitLenght;
		this.numCars = numCars;
		this.cars = cars.clone(); 
	}
	
	public void run() {
		while(hasFinished() == -1) {
			for(int i = 0; i < numCars; i++) {
				print(cars[i]);
			}
			for(int i = 0; i < numCars; i++) {
				cars[i].advance();
			}
			System.out.println();
		}
		for(int i = 0; i < numCars; i++) {
			print(cars[i]);
		}
		System.out.println( "Car " + cars[hasFinished()].getId() + " wins!!!");
	}
	
	public void print(Car car) {
		if (car.getPos() >= circuitLenght) {
			car.setPos(circuitLenght);
		}
		for(int i = 0; i <= circuitLenght; i++) {
			if (i == car.getPos()) {
				System.out.print(car);
			}
			else {
				System.out.print("_");
			}
		}
		
		System.out.print("|");
		System.out.println();
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
