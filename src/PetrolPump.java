
public class PetrolPump {
	private String number;
	private int litersAtTime;

	public PetrolPump(String number) {
		this.number = number;
	}

	public void simulateLitersAtTime(int litersAtTime) {
		this.litersAtTime = litersAtTime;
	}
	
	public int getLitersAtTime() {
		return litersAtTime;
	}
}
