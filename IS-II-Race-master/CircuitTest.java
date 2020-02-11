import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class CircuitTest {

	@Test
	public void testCircuit() {
		Random rand = new Random();
		Car[] cars = new Car[4];
		
		for(int i = 0; i < 4; i++) {
			cars[i] = new Car(i + 1, rand.nextInt(5) + 1, 50, 50);
		}
		
		Circuit c = new Circuit(40, 4, cars);
		assertEquals(c.getCar(0).getId(), 1);
		assertEquals(c.getCar(1).getId(), 2);
		assertEquals(c.getCar(2).getId(), 3);
		assertEquals(c.getCar(3).getId(), 4);
		assertNull(c.getCar(8));
	}

	@Test
	public void testRun() {
		Random rand = new Random();
		Car[] cars = new Car[4];
		
		for(int i = 0; i < 4; i++) {
			cars[i] = new Car(i + 1, rand.nextInt(5) + 1, 50, 50);
		}
		
		Circuit c = new Circuit(40, 4, cars);
		c.run();
		assertNotSame(c.getCar(0).getPos(), 0);
		assertNotSame(c.getCar(1).getPos(), 0);
		assertNotSame(c.getCar(2).getPos(), 0);
		assertNotSame(c.getCar(3).getPos(), 0);
	}

}
