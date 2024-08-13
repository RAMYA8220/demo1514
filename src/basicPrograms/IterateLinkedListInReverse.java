package basicPrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListInReverse {

	public static void main(String[] args) {
	
		
		 LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");
	        
	        
//	        ListIterator<String> li=list.listIterator(list.size());
//	        while(li.hasPrevious())
//	        {
//	        		System.out.println(li.previous());
//	        	
//	        }
	        
	        
	        Iterator<String> li=list.descendingIterator();
	        while (li.hasNext()) {
				System.out.println(li.next());
				
			}

	}

}
