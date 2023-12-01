package in.waisl.assignent;

import java.util.Scanner;

public class Calculate_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the 1st number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number");
		
		int b = sc.nextInt();
		
		int c;
		
		c=a+b;
		System.out.println("The output of "+a+" + "+b+ "="+c);
		c=a-b;
		System.out.println("The output of "+a+" - "+b+ "="+c);
		c=a*b;
		System.out.println("The output of "+a+" * "+b+ "="+c);
		c=a/b;
		System.out.println("The output of "+a+" / "+b+ "="+c);
		c=a%b;
		System.out.println("The output of "+a+" mod "+b+ "="+c);
		
		
		

	}

}
