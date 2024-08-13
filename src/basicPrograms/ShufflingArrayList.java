package basicPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ShufflingArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("ramya");
		al.add("srivani");
		al.add("rakesh");
		al.add("dinesh");
		
        Collections.shuffle(al);
//        for(String a:al)
//        {
//        	System.out.println(a);
//        }
        
        System.out.println(al);

	}

}
