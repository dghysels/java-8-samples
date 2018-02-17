package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionSample {

	public static void main(String args[]){
		// accepts nulls as *one* of the keys or any value
		Map map = new HashMap();
		// nulls not allowed - synchronized
		Map hashtable = new Hashtable();
		
		SortedMap tree = new TreeMap();
		
		SortedSet set = new TreeSet();
		Set hashset1 = new HashSet();
		
		HashSet hashSet2 = new HashSet();
		
		List linkedList = new LinkedList();
		
		Queue list = new LinkedList();
		
		
	}
}
