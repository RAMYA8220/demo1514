package basicPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SwapEleInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("ramya");
		al.add("srivani");
		al.add("rakesh");
		al.add("dinesh");
		
		Collections.swap(al, 1, 2);
		System.out.println(al);
		
	}
}
