package classes___;

import java.util.ArrayList;

public class Arraylist___ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Check the List is empty or not..."+list.isEmpty());
		System.out.println("1.Check the Size of the Array..."+list.size());
		list.add(21);
//		list.add('S');
//		list.add(2, "Nithiya");
		list.add(1);
		list.add(11);
		list.add(111);
		list.add(1111);
		System.out.println("2.Check the Size after added the Values in the Array..."+list.size());
		System.out.println(list);
		System.out.println(list.contains('S'));
		System.out.println(list.contains(55));
		System.out.println("Element at the position 0 is .. "+ list.get(0));
		System.out.println("Remove the element at the position 0  .. "+ list.remove(0));
		System.out.println("After removed the element at the position 0 is .. "+ list.get(0));
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		 for(Integer li: list) {
			 System.out.println(li);
		 }
		
		
	}

}
