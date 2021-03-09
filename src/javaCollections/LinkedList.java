package javaCollections;

import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.LinkedList<String> ll = new java.util.LinkedList<String>();
		ll.add("Swati");
		ll.add("Narayan");
		ll.add("Sakhare");
		ll.add(null);
		ll.add(null);
		ll.remove(2);
		System.out.println(ll);
		ll.contains("yan");
		ll.remove(1);

		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
