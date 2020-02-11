import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void testAdvance() {
		Car c = new Car(1, 4, 30, 40);
		c.advance();
		assertEquals(c.report(), "Car 1 -> Speed: 4 Fuel: 26/40");
		assertEquals(c.getPos(), 4);
	}
	
	@Test
	public void testToString() {
		Car c = new Car(1, 4, 30, 40);
		assertEquals(c.toString(), ".[1].");
	}
}
