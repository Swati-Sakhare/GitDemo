package javaCollections;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.LinkedHashSet<Integer> set = new java.util.LinkedHashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(500);
		set.add(null);
		System.out.println(set);
		set.remove(100);
		System.out.println(set);
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
