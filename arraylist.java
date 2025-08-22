package collections;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
	
		 ArrayList li = new ArrayList();
		 li.add(10);
		 li.add(25);
		 li.add(false);
		 li.add("pavan");
		 li.add(1,9);
		 li.set(0,4);
		 li.remove(0);
		 System.out.println(li);
		 System.out.println(li.size());
		 System.out.println(li.get(3));
		 arraylist a2 = new arraylist();
		 System.out.println(li.isEmpty());

	}

}