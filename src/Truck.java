import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Truck {

	private String id;

	public Truck(String id) {
		this.id = id;
	}

	public String status() {
		List<String> status = Arrays.asList("start", "inprogress", "exit");
		Collections.shuffle(status);
		return status.iterator().next();
	}

	public boolean isNumber(String trucknumber) {
		return id.equals(trucknumber);
	}

}
