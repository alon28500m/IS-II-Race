import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCars;
		int circLength;
		
		System.out.print("Length of the circuit: ");
		circLength = scan.nextInt();
		do{
		System.out.print("Number of cars [1-5]: ");
		numCars = scan.nextInt();
		}while(numCars <= 0 && numCars >= 6);
		
		Random rand = new Random();
		Car[] cars = new Car[numCars];
		
		for(int i = 0; i < numCars; i++) {
			cars[i] = new Car(i + 1, rand.nextInt(5) + 1, 50, 50);
		}
		
		Circuit circuit = new Circuit(circLength, numCars, cars);
		
		for(int i = 0; i < numCars; i++) {
			System.out.println(cars[i].report());
		}
		
		circuit.run();
		
		System.out.println();
		for(int i = 0; i < numCars; i++) {
			System.out.println(cars[i].report());
		}
	}
}
