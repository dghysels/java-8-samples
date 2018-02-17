package lambda.runnable;

public class Person {

	private String name;
	
	Person(String n){
		this.name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
}
