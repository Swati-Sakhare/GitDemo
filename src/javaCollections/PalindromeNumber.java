package javaCollections;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0;
		int sum = 0;
		int n = 4554;
		int temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if(temp == sum) {
			System.out.println("Number is a Palindrome");
		}
		else {
			System.out.println("Number is not a Palindrome");
		}
	}

}
//45545