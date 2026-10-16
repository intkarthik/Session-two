package packages_1;

public class Task_14_14 {
// count of odd numbers using while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 10, end = 30;
		int count = 0;
		while (start <= end) {
			if (start % 2 == 0) {
				count++;
			}
			start++;
		}
		System.out.println("The count of odd numbers : " + count);
	}

}
