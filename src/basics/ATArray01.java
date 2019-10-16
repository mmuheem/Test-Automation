package basics;

import java.util.ArrayList;

public class ATArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("B");
		al.add("A");
		al.add("C");
		al.add("D");
		al.add("A");
		int count = al.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) 
		{
			String value = al.get(i);
			System.out.println(value);
			
		}
		
	}

}
