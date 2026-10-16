package packages_1;

import java.util.Scanner;

public class Task_10_10 {
	
	public static void main(String[] args) {
		int sum=0,n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=input.nextInt();
		
		for(;n!=0;) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
}
