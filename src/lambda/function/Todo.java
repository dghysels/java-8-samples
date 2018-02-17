package lambda.function;

public class Todo {

	Todo(String n){
		this.name = n;
	}
	
	private String name;
	
	public String toString(){
		return this.name;
	}
	
	public static Todo mergeTasks(Todo t1, Todo t2){
		return new Todo(t1.toString() + t2.toString());
	}
}
