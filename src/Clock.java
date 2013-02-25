
public class Clock {

	public static int tick = 0;

	public static void moveAhead() {
		tick++;
	}
	
	public static void reset() {
		tick = 0;
	}

}
