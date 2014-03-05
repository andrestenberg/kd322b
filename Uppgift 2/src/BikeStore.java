import java.util.ArrayList;

public class BikeStore {
	// private String allBikes;
	// private String newBikes;
/** Gor en array for cyklarna*/
	
	ArrayList<Bike> bikes = new ArrayList<Bike>();

	public String getAllBikes() {
		
		/** gor en for-loop for size, price, color*/
	
		String s = "";
		for (Bike bike1 : bikes) {
			

			s = s + "Color of the Bike is " + bike1.getColor() 
					+ "\n Size of the bike is " + bike1.getSize()
					+ "\n Price of the bike is " + bike1.getPrice() + "\n";
		}
		return s;

	}
/** lägger in värdena for size, price, color*/
	public void addBike(String farg, int storlek, int pris) {
		bikes.add(new Bike(farg, storlek, pris));
	}
}