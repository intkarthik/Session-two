package packages_1;

import java.util.Scanner;

public class Task_17_17 {

	public static void main(String[] args) {
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		while (n != 0) {
			int rem = n % 10;
			if (rem > max) {
				max = rem;
			}
			n = n / 10;
		}
		System.out.println("The largest number is : " + max);
	}
}
