package javaCollections;

public class TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.TreeSet<String> set = new java.util.TreeSet<String>();
		set.add("Swati");
		set.add("Narayan");
		set.add("Sakhare");
//		set.add(null);
		set.add("Swati");
		System.out.println(set);
		set.descendingSet();
//		System.out.println(set);
		set.isEmpty();
		System.out.println(set);
	}

}
