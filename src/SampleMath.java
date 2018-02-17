import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SampleMath {

	public static void main(String[] args){
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,4,5,6,7));
		
		int val1 = SampleMath.findSquareOfMaxOdd(numbers);
		int val2 = SampleMath.findSquareOfMaxOddUsingLambdas(numbers);
		
		System.out.println(val1);
		System.out.println(val2);
	}
	
	private static int findSquareOfMaxOdd(List<Integer> numbers) {
		int max = 0;
		for (int i : numbers) {
			if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
				max = i;
			}
		}
		return max * max;
	}
	
	public static int findSquareOfMaxOddUsingLambdas(List<Integer> numbers) {
		return numbers.stream()
				.filter(i->SampleMath.isOdd(i)) 		//Predicate is functional interface and
				.filter(i->SampleMath.isGreaterThan3(i))	// we are using lambdas to initialize it
				.filter(SampleMath::isLessThan11)	// rather than anonymous inner classes
				.max(Comparator.naturalOrder())
				.map(i -> i * i)
				.get();
	}

	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}
	
	public static boolean isGreaterThan3(int i){
		return i > 3;
	}
	
	public static boolean isLessThan11(int i){
		return i < 11;
	}
}
