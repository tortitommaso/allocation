import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TruckList {
	public static final int HOW_MANY = 4;
	private static List<Truck> truckList;

	public static void init() {
		truckList = new ArrayList<Truck>();
		for (int i = 0; i < HOW_MANY; i++) {
			truckList.add(new Truck(String.valueOf(i)));
		}
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
