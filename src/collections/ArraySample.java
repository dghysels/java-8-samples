package collections;

import java.util.Arrays;
import java.util.List;

public class ArraySample {

	public static void main(String[] args) {
		int[] values = new int[10];
		int morevalues[] = new int[5];
		int[][] valuevalue;
		int[][] valuevaluevalue[] = new int[3][1][1];
		
		Object[] initializedArray = new Object[]{1,2,3,4};
		Object[] initializedObjectArray = new Object[]{new Object(), new Object()};
		
		List morevaluesList = Arrays.asList(morevalues);
		List valueslist = Arrays.asList(values);
		
		Object[] morearray = morevaluesList.toArray();
		
		
		valueslist.forEach((s) -> System.out.print(s.toString()) );

	}

}
