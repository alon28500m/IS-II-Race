public class Car {
	private int speed;
	private int x;
	private int id;
	private int fuel;
	private int maxFuel;
	
	public Car(int id, int speed, int fuel, int maxFuel) {
		this.speed = speed;
		this.id = id;
		this.maxFuel = maxFuel;
		this.fuel = fuel;
		x = 0;
	}
	
	public void advance() {
		if (fuel > 0) {
			x += speed;
			fuel -= speed;
			if (fuel < 0) {
				fuel = 0;
			}
		}
	}
	
	public String toString() {
		return ".["+ id + "].";
	}
	
	public String report() {
		return "Car " + id + " -> Speed: " + speed + " Fuel: " + fuel + "/" + maxFuel;
	}
	
	public int getId() {
		return id;
	}
	
	public int getPos() {
		return x;
	}
	
	public void setPos(int x) {
		this.x = x;
	}
	
	/*
	public void breakk() {
		Random rand = new Random();
		if(rand.nextInt() % 100 < 10) {
			speed = 0;
		}
	}
	*/
}
