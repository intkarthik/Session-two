package packages_1;

public class Task_11_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pro = 1;
		int n = 999;
		while (n != 0) {
			int rem = n % 10;
			pro = pro * rem;
			n = n / 10;
		}
		System.out.println(pro);
	}

}
