import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TrackList {
	private static List<Truck> truckList;

	public static void init() {
		truckList = new ArrayList<Truck>();
		truckList.add(new Truck("1"));
		truckList.add(new Truck("2"));
		truckList.add(new Truck("3"));
	}

	public static Truck find(String trucknumber) {
		for (Truck truck : truckList) {
			if (truck.isNumber(trucknumber))
				return truck;
		}
		return null;
	}

	public static String asJson() {
		String result = "[";
		for (Iterator iterator = truckList.iterator(); iterator.hasNext();) {
			Truck truck = (Truck) iterator.next();
			result += truck.asJson() ;
			if (iterator.hasNext()) result += ",\n";
		}
		result += "]";
		return result;
	}

}
