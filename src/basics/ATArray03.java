package basics;

import java.util.TreeSet;

public class ATArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TreeSet object is created. 
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("B");
		ts.add("A");
		ts.add("C");
		ts.add("D");
		ts.add("A");
		ts.add("X");
		ts.add("Y");
		ts.add("Z");
		int count = ts.size();
		System.out.println(count);
		//for each loop is included
		//duplicates are removed and o/p will be in sorted order. 
		for (String value : ts) 
		{
			System.out.println(value);
			
		}
	}

}
