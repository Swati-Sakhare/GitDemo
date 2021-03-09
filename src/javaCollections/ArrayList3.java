package javaCollections;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		//al.add("cyber");
		//al.add('c');
		for(Integer i:al)
		{
			System.out.println(i);
		}
	}

}
