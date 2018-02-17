package objects.package1;

public class County {
	public int countypublicvalue = 1;
	private int countyprivatevalue  = 1;
	int countypackagevalue = 1;
	protected int countyprotectedvalue = 1;
	
	public static void main(String args[]){
		County county = new County();
		City city = new City();
		
	}
	
	public void doCountywork(){
		System.out.println("doing county work");
	}
	
	
}
