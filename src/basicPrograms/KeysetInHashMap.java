package basicPrograms;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeysetInHashMap {

	public static void main(String[] args) {
		
		        // Creating a HashMap
		        Map<Integer, String> map = new HashMap<>();
		        map.put(1,"Apple");
		        map.put(2,"Banana");
		        map.put(3,"Cherry");

		        // Getting all keys from the HashMap
		        Set<Integer> keys = map.keySet();

		        // Displaying the keys
		        System.out.println("Keys in the HashMap:");
		        for (Integer key : keys) {
		            System.out.println(key);
		          
		        }
		    }
		

	}


