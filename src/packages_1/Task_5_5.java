package packages_1;

public class Task_5_5 {
// sum of even numbers using while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,i=1;
		while(i<=20) {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println("The sum of even numbers:" +sum);
	}

}
