package basicPrograms;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
//		a.add(10);
//		a.add(20);
		
		a.add(0, 1);
		a.add(1, 2);
		a.add(2, 3);
		
		ArrayList<Integer> b=new ArrayList<>();
		b.addAll(a);
//		
//		b.addAll(0, a);
//		b.add(1, 4);
		
		System.out.println(a);
		
		
		
		
		
		
		

	}

}
