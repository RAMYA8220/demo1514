package basicPrograms;


import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		List<Integer> ol=new LinkedList<Integer>();
		ol.add(1);
		ol.add(2);
		ol.add(3);
		ol.add(4);
		ol.add(5);
		
//		Collections.reverse(ol);
//		System.out.println(ol);
		
		List<Integer> rl=new LinkedList<Integer>();
		for (int i =ol.size()-1; i >= 0; i--) {
			
		rl.add(ol.get(i));

	}
		System.out.println(rl);

}
}