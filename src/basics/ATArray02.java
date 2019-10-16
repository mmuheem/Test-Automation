package basics;

import java.util.HashSet;

public class ATArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("C");
		hs.add("D");
		hs.add("A");
		int count = hs.size();
		System.out.println(count);
		//for each loop included.
		
		for (String value : hs) 
		{
			//output is always sorted order and duplicates are not allowed. 
			System.out.println(value);
		}
	}

}
