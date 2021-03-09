package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(null);
		al.add(null);
		System.out.println(al);
		//3rd Approach to extract values from collection
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
