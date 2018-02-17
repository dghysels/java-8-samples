package objects.package2;

import objects.package1.Location;

public class County extends Location{
	public int countypublicvalue = 1;
	private int countyprivatevalue  = 1;
	int countypackagevalue = 1;
	protected int countyprotectedvalue = 1;
	
	public static void main(String args[]){
		County county = new County();
		
		county.getLocationName();
		
	}
	
	@Override
	public void doLocationWork(){
		System.out.println("doing county location work");
	}
}
