package objects;

import objects.package1.Location;
import objects.package2.Country;
import objects.package2.County;
import objects.package2.State;

public class InitializationSamples {

	int value = 0;
	
	public static void main(String args[]){
		
		main();
		// does not compile!
		//System.out.print(value);
		
		InitializationSamples sample = new InitializationSamples();
		System.out.println(sample.value);
		
		System.out.println("a null string " + null);
		
		sample.castclasses();
		
	}
	
	public void castclasses(){
		try{
			// RUNTIME ERROR - objects.package2.Class2 cannot be cast to objects.package1.Class3
			Country c3 = (Country)new Location();
			c3.doCountryWork();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		// RUNTIME ERROR - objects.package2.Class2 cannot be cast to objects.package2.Class4
		try{
			State c4 = (State)new Location();
			c4.doLocationWork();
			c4.doStateWork();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		Location c2 = new Location();
		// RUNTIME ERROR
		try{
			State c4from2 = (State) c2;
			c4from2.doLocationWork();
			c4from2.doStateWork();
		}
		catch(Throwable e){
			System.out.println(e.getMessage());
		}
		
		Location locationFromCountry = new Country();
		
		locationFromCountry.doLocationWork();
		
		Location locationFromState = new State();
		
		locationFromState.doLocationWork();
	}
	
	
	public static void main(){
		// does not compile
		// value = 5;
		int value = 5;
	}
}
