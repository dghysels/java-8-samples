package objects;

public class IntegerSamples {

	public static void main(String[] args) {
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

}
