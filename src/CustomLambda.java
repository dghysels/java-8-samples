import java.util.function.Function;

public class CustomLambda {

	public static void main(String[] args){
		Work w = (a, b) -> a* a + b/a;
		
		Integer result = w.doWork(6, 8);
		
		System.out.println(result.intValue());
	}
	
	public interface Work{
		public Integer doWork(Integer v1, Integer v2);
	}
}
