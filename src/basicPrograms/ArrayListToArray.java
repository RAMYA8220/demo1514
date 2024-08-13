package basicPrograms;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("ramya");
		al.add("srivani");
		al.add("rakesh");
		al.add("dinesh");
		
		String array[]= new String[al.size()];
		array=al.toArray(array);
		
		for(String a:array)
		{
			System.out.println(a);
		}
		

	}

}
