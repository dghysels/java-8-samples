package lambda.function;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String args[]){
		Function<Todo, String> f = t -> t.toString();
		Function<Todo, String> f2 = Todo::toString;
		
		BinaryOperator<Todo> b = (t1, t2) -> Todo.mergeTasks(t1, t2); 
		BinaryOperator<Todo> b2 = Todo::mergeTasks;
	}
}
