package javaCollections;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		//1st Approach to extract values from collection
		for(String ss:al) {
			System.out.println(ss);
		}
		System.out.println("================================");
		//2nd Approach to extract values from collection
		String ss = al.get(0);
		System.out.println(ss);
		ss = al.get(1);
		System.out.println(ss);
		
	}

}
