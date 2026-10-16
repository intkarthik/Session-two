package packages_1;

public class Task_12_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse = 0, n = 345;
		for (int i = 1; n != 0; ) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}
		System.out.println(reverse);
	}

}
