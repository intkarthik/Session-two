package packages_1;

import java.util.Scanner;

public class Task_13_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev= 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		int og_val = n;
		for (; n != 0;) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (og_val == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
