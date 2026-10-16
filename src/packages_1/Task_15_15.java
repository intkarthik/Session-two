package packages_1;

import java.util.Scanner;

public class Task_15_15 {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting number : ");
		int start = scanner.nextInt();
		System.out.println("Enter the ending number : ");
		int end = scanner.nextInt();

		while (start <= end) {
			if (start % 2 != 0) {
				count++;
			}
			start++;
		}
		System.out.println("The count of odd numbers is : " + count);

	}
}
