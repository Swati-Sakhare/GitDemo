package javaCollections;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("cyber");
		al.add('c');
		al.add(true);
		al.add("Droid");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		al.remove("cyber");
		System.out.println(al.size());
		System.out.println(al.contains("Droid"));
		System.out.println(al.contains("Droiddd"));
		al.clear();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
	}

}
