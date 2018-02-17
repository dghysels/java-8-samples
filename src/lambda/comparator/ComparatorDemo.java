package lambda.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String args[]){
		
		Comparator<City> comparator = (c1, c2) -> c1.toString().compareTo(c2.toString());
		// add braces AND a return statement
		//Comparator<City> comparator2 = (c1, c2) -> {return c1.toString().compareTo(c2.toString());};
		
		City c1 = new City(25000, "city4", "Michigan");
		City c2 = new City(80000,"city2", "Wisconson");
		City c3 = new City(5000, "city3", "Ohio");
		City c4 = new City(60000, "city1", "Indiana");
	
		List<City> cities = new ArrayList<>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		cities.add(c4);
		
		cities.sort(comparator);
		cities.forEach(c -> System.out.println(c));
		
		int result = comparator.compare(c1, c2);
		System.out.println("c1  vs c2 =" + result);
		result = comparator.compare(c2, c1);
		System.out.println("c2  vs c1 =" + result);
		result = comparator.compare(c3, c4);
		System.out.println("c3  vs c4 =" + result);
	}
}
