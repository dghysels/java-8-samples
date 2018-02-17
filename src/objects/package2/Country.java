package objects.package2;

import objects.package1.Location;

public class Country extends Location{

	public void doCountryWork(){
		City city = new City();
		County county = new County();
		county.countypublicvalue = 1;
		
		// compile failure
		//this.countrypackagevalue= 5;
		this.locationprotectedvalue = 5;
		
		// compile failure
		//city.citypackagevalue = 2;
		//city.cityprotectedvalue = 2;
		city.citypublicvalue =2;
		
		System.out.println("doing country work");
	}
	
	private class Continent extends County{
		public Continent(){
			this.countyprotectedvalue = 2;
			this.countypublicvalue = 5;
			// compile failure
			//this.countrypackagevalue = 5;
		}
	}
	
	
}
