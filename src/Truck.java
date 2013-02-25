
public class Truck {

	private String id;
	private int litersToLoad;
	private String status;
	private PetrolPump petrolPump;

	public Truck(String id) {
		this.id = id;
		this.status = "start";
	}

	public String status() {
		int actualLoaded = petrolPump.getLitersAtTime() * Clock.tick;
		if ("inprogress".equals(status) && actualLoaded >= litersToLoad) {
			status = "exit";
		}
		return status;
	}

	public boolean isNumber(String trucknumber) {
		return id.equals(trucknumber);
	}

	public String asJson() {
		return "{ \"trucknumber\": \"" + id + "\", \"status\": \"" + status()
				+ "\" }";
	}

	public void simulateLitersToLoad(int litersToLoad) {
		this.litersToLoad = litersToLoad;
	}

	public void moveTo(PetrolPump petrolPump) {
		this.petrolPump = petrolPump;
		this.status = "inprogress";
	}

}
