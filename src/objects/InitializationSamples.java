package objects;

import objects.package1.County;
import objects.package2.Country;
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
		sample.assignStuff();
		
	}
	
	public void castclasses(){
		try{
			// RUNTIME ERROR - objects.package2.Class2 cannot be cast to objects.package1.Class3
			Country c3 = (Country)new County();
			c3.doCountryWork();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		// RUNTIME ERROR - objects.package2.Class2 cannot be cast to objects.package2.Class4
		try{
			State c4 = (State)new County();
			c4.doCountywork();
			c4.doStateWork();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		County c2 = new County();
		// RUNTIME ERROR
		try{
			State c4from2 = (State) c2;
			c4from2.doCountywork();
			c4from2.doStateWork();
		}
		catch(Throwable e){
			System.out.println(e.getMessage());
		}
		
		County c2fromc3 = new Country();
		
		c2fromc3.doCountywork();
		
		County c2fromc4 = new State();
		
		c2fromc4.doCountywork();
	}
	
	public void assignStuff(){
		int value = new Integer(4);
		System.out.println("integer assigned from Integer " + value);
		Integer integer = 5;
		System.out.println("integer assigned from int " + integer);
		
		value = integer;
		
		Integer integer2 = new Integer("5");
		System.out.println("integer assigned from string " + integer2);
		
		int integer3 = Integer.parseInt("5");
		System.out.println("integer assigned from parseint " + integer3);
		
		// Exception!
		try{
			int integer4 = new Integer("abc");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(){
		// does not compile
		// value = 5;
		int value = 5;
	}
}
