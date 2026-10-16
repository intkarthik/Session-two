package packages_1;

public class Task_6_6 {
//sum of odd numbers using while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 1;
		while (i <= 10) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("The sum of odd number is : " + sum);
	}

}
