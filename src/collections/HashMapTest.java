package collections;
import java.util.HashMap;

public class HashMapTest {

	 public static void main(String[] args){
		HashMapTest maptest = new HashMapTest();
		maptest.test();
	 }
	 
	 public void test(){
		 HashMap<ClassA, ClassA> map = new HashMap<>();
		 ClassA c1 = new ClassA();
		 ClassA c2 = new ClassA();
		 map.put(c1, c1);
		 map.put(c2, c2);
	 }
	
	 public class ClassA{
		Integer value1;
		Integer value2;
		
		@Override
		public boolean equals(Object o){
			return ((ClassA)o).value1.equals(this.value1);
		}
		
		@Override
		public int hashCode(){
			return this.value1.hashCode();
		}
	}
	 
	 
}
