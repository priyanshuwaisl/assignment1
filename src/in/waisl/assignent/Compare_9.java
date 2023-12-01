package in.waisl.assignent;
import java.util.Scanner;


public class Compare_9 {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		System.out.println("Enter 2nd number");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if(a>b) {
			System.out.println("Number 1 is greater");
			
		}
		else if (a<b) {
			System.out.println("Number 2 is greater");
			
		}
		else if(a==b) {
			System.out.println("Number 1 and Number 2 are equal");
			
		}
		
		else {
			System.out.println("Invalied");
			
		}
		// TODO Auto-generated method stub

	}

}
