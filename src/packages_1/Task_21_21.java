package packages_1;

import java.util.Scanner;

public class Task_21_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		while (n != 0) {
			n = n / 10;
			break;
		}
		System.out.println(n);
	}

}
