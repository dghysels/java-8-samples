package objects.package1;

public class City{
	public int citypublicvalue = 1;
	private int cityprivatevalue  = 1;
	int citypackagevalue = 1;
	protected int cityprotectedvalue = 1;
	
	public int doCityWork(){
		cityprivatevalue = 2;
		
		return cityprivatevalue;
	}
}
