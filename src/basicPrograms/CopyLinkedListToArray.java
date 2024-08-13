package basicPrograms;

import java.util.LinkedList;
import java.util.List;

public class CopyLinkedListToArray {

	public static void main(String[] args) {
		
		List<String> l=new LinkedList<String>();
		l.add("dxfcgvb");
		l.add("ramya");
		
		String array[]=new String[l.size()];
		array= l.toArray(array);
		for (String s : array) {
			
			System.out.println(s);
		}
	}

}
