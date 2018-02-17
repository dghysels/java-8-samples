package objects.package2;

import objects.package1.Location;

public class State extends Location{

	public void doStateWork(){
		County county = new County();
		
		// compile failure
		//county.countypackagevalue = 2;
		//county.countyprotectedvalue = 2;
	}
	
	@Override
	public void doLocationWork(){
		System.out.println("doing location work in state!");
	}
}
