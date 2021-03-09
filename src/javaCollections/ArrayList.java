package javaCollections;


class Stud {
	String studName;
	int studId;

	Stud(String studName, int studId) {
		this.studId = studId;
		this.studName = studName;

	}
}

class Emp {
	String empName;
	int empId;

	Emp(String empName, int empId) {
		this.empId = empId;
		this.empName = empName;

	}
}

public class ArrayList {

	public static void main(String[] args) {

		java.util.ArrayList al = new java.util.ArrayList();
		Emp e1 = new Emp("Cyber", 101);
		Stud s1 = new Stud("Success", 202);
		Integer e = new Integer(1);
		al.add(10);
		al.add(e1);
		al.add(s1);
		al.add("Test");
		System.out.println(al);
		for(Object o:al)
		{
			if(o instanceof Integer) {
				Integer i = (Integer)o;
				System.out.println(i);
//				System.out.println(o);
			}
			else if(o instanceof Emp) {
				
				System.out.println(e1.empId +"-" + e1.empName);
			}
			else if(o instanceof Stud) {
				System.out.println(s1.studId +"-" + s1.studName);
			}
			else if(o instanceof String) {
				System.out.println(o);
			}
			
		}

	}

}
