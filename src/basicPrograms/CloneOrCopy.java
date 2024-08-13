package basicPrograms;

import java.util.ArrayList;

public class CloneOrCopy {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<>();
		
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        
       // ArrayList<Integer> b=new ArrayList<>(a);
       
        ArrayList<Integer> b=new ArrayList<>();
        b.addAll(a);
        
        ArrayList<Integer> clonedList = (ArrayList<Integer>) a.clone();

        
        System.out.println(clonedList);
        
       
	}

}
