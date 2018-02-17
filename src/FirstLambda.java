
public class FirstLambda {

	public static void main(String[] args){
		Runnable r1 = new Runnable(){

			@Override
			public void run() {
				System.out.println("Hello world one!");
				
			}
			
		};
		
		Runnable r2 = () -> System.out.println("Hello world two!");
		
		DoIt it = () -> System.out.println("Hello world three!");
		
		r1.run();
		r2.run();
		it.Go();
	}
	
	interface DoIt{
		public void Go();
	}
}
