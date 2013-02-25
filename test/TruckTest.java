import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TruckTest  {

	private Truck truck;
	private PetrolPump petrolPump;
	
	@Before 
	public void createTruckAndPetrolPump() {
		Clock.reset();
		truck = new Truck("1");
		petrolPump = new PetrolPump("1");
		truck.moveTo(petrolPump);
	}
	@Test
	public void onlyOneTick() throws Exception {
		truck.simulateLitersToLoad(1000);
		petrolPump.simulateLitersAtTime(1000);
		assertEquals("inprogress", truck.status());
		Clock.moveAhead();
		assertEquals("exit", truck.status());
	}
	
	@Test
	public void simulateLoad() {
		truck.simulateLitersToLoad(1000);
		petrolPump.simulateLitersAtTime(500);
		assertEquals("inprogress", truck.status());
		Clock.moveAhead();
		assertEquals("inprogress", truck.status());
		Clock.moveAhead();
		assertEquals("exit", truck.status());
	}

}
