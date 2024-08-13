package basicPrograms;

import java.util.LinkedList;
import java.util.List;

public class GetFirst_LinkedList {

	public static void main(String[] args) {
		List<String> al=new LinkedList<String>();
		al.add(0, "ramya");
		al.add("srivani");
		al.add("rakesh");
		al.add("dinesh");

		if(!al.isEmpty())
		{
		System.out.println( al.getFirst());
		}
		else
		{
			System.out.println("no first ele");
		}
	}

}
