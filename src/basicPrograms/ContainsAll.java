package basicPrograms;

import java.util.ArrayList;
import java.util.List;

public class ContainsAll {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(5);
		
		
		List<Integer> m=new ArrayList<Integer>();
		m.add(3);
		m.add(6);
		
	     boolean b=	m.containsAll(l);
		System.out.println(b);

	}

}
