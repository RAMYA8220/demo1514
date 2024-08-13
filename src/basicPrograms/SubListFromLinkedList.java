package basicPrograms;

import java.util.LinkedList;
import java.util.List;

public class SubListFromLinkedList {
	public static void main(String[] args) {
   
		List<Integer> l= new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
	List<Integer> sub=	l.subList(1, 4);
	System.out.println(sub);
	
	
	}
}
