package javaCollections;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.HashSet<String> set = new java.util.HashSet<String>();
		set.add("Swati");
		set.add("Rahul");
		set.add("Rakesh");
		set.add("Swati");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.hashCode());
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		set.remove(0);
	}

}
