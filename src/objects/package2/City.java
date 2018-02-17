package objects.package2;

import objects.package1.Location;

public class City extends Location{
	public int citypublicvalue = 1;
	private int cityprivatevalue  = 1;
	int citypackagevalue = 1;
	protected int cityprotectedvalue = 1;
	
	public int doCityWork(){
		cityprivatevalue = 2;
		
		return cityprivatevalue;
	}
	
	public String getCityInfo(){
		return "info for city";
	}
	
	@Override 
	public String getLocationName(){
		return super.getLocationName();
	}
}
