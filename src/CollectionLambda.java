import java.util.HashMap;
import java.util.Map;

public class CollectionLambda {

	public static void main(String[] s) {
        Map<String, Boolean> nameMap = new HashMap<>();
        
        NameInterface i = (k) -> {
        	System.out.println("creating a value for \"" + k +  '"');return true;
        };
        
        nameMap.computeIfAbsent("Frank", k -> i.compute(k));
        nameMap.computeIfAbsent("Mike", k -> f(k));
        nameMap.computeIfAbsent("Jeff", k -> {
        											System.out.println("creating a value for \"" + k + '"'); 
        											return true;
        							  });
        nameMap.computeIfAbsent("Mark", k->s(k));
        
    }
	
	public interface NameInterface{
		public boolean compute(String key);
	}
	
    static boolean f(String s) {
        System.out.println("creating a value for \""+s+'"');
        return s.isEmpty();
    }
    static boolean s(String s){
    	System.out.println("creating a value for \""+s+s+s+'"');
    	return s.isEmpty();
    }

}
