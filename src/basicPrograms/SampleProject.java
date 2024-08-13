package basicPrograms;


import java.util.HashSet;
import java.util.TreeSet;

public class SampleProject 
{
	public static void main(String[] args) 
	{
		
		TreeSet ts = new TreeSet();
		
		ts.add(11);
		ts.add(16);
		ts.add(12);
		ts.add(9);
		ts.add(3);
		ts.add(1);
		
		System.out.println(ts);
		
//		Collections.sort(ts,new Comparator<Integer>() {
//			
//			@Override
//			public int compare(Integer e1 , Integer e2)
//			{
//				return Integer.compare(e2, e1);
//			}
//		});
//		System.out.println(ts);
			
	}

}
