package packages_1;

import java.util.Scanner;

public class Task_8_8 {
	// check positive /negative/zero using while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 3, i = 1;
		Scanner input = new Scanner(System.in);

		while (i <= count) {
			System.out.println("Enter the number : ");
			int num = input.nextInt();
			if (num > 0) {
				System.out.println("Given number is +ve : " + num);
			} else if (num < 0) {
				System.out.println("Given number is -ve : " + num);
			} else {
				System.out.println("Given number is equals to zero");
			}
			i++;
		}
		count++;

	}

}
