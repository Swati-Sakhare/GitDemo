package javaCollections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add('s');
		al.add("Swati");
		al.add(20.3f);
		al.add(10);
		al.addAll(al);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.removeAll(al);

	}

}
