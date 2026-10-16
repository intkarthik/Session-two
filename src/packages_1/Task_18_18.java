package packages_1;

public class Task_18_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 3;
		int exp = 3;
		int pow = 1;
		int i = 1;

		while (i <= exp) {
			pow = pow * base;
			i++;
		}
		System.out.println(pow);
	}

}
