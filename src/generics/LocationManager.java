package generics;

import java.util.ArrayList;
import java.util.List;

public class LocationManager<U extends Building> {

	public List<U> locations = new ArrayList<U>();
	
	public void addLocation(U u){
		locations.add(u);
	}
	
	public static void main(String args[]){
		LocationManager<Building> buildingManager = new LocationManager<Building>();
		
		RetailBuilding b = new RetailBuilding();
		buildingManager.addLocation(b);
		OfficeBuilding o = new OfficeBuilding();
		buildingManager.addLocation(o);
		//City c = new City();
		//buildingManager.addLocation(c);
	}
}
