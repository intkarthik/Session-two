package packages_1;

import java.util.Scanner;

public class Task_9_9 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int value = sc.nextInt();
		while (value != 0) {
			value = value / 10;
			count++;
		}
		System.out.println(count);
	}
}
