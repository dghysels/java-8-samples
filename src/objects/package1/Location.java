package objects.package1;

public class Location {

	public int locationpublicvalue = 1;
	private int locationprivatevalue  = 1;
	int locationpackagevalue = 1;
	protected int locationprotectedvalue = 1;
	
	protected String getLocationName(){
		return null;
	}
	
	String getLocationInf(){
		return null;
	}
	
	public void doLocationWork(){
		System.out.println("Do location work");
	}
}
