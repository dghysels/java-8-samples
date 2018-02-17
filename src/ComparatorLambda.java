import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorLambda {

	public static void main(String[] args){
		ComparatorLambda comparator = new ComparatorLambda();
		List<Person> personList = comparator.createShortList();
		
		 System.out.println("=== Sorted Asc Age ===");
		 Collections.sort(personList, ( p1,  p2) -> p1.getAge().compareTo(p2.getAge()));
		 
		 for(Person p:personList){
		        System.out.println(p.getFirstName() + "-" + p.age.toString());
		 }
		 
		 System.out.println("----- filtered list -----------");
		 List<Person> filteredList = personList.stream().filter(p -> p.firstName.equals("a")).collect(Collectors.toList());
		 filteredList.forEach(p->{System.out.println(p.firstName);});
	}
	
	public List<Person> createShortList(){
		List<Person> l = new ArrayList<Person>();
		
		l.add(new Person(5,"a","b"));
		l.add(new Person(1,"q","z"));
		l.add(new Person(7,"e","k"));
		
		return l;
	}
	
	
	public class Person{
		
		public Person(){
			
		}
		
		public Person(int age, String firstName, String lastName){
			this.age = age;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		private String firstName;
		private String lastName; 
		private Integer age;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		
		
	}
}
