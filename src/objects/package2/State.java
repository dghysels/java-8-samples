package objects.package2;

import objects.package1.County;

public class State extends County{

	public void doStateWork(){
		County county = new County();
		
		// compile failure
		//county.countypackagevalue = 2;
		//county.countyprotectedvalue = 2;
	}
	
	@Override
	public void doCountywork(){
		System.out.println("doing county work in state!");
	}
}
