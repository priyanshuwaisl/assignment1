package in.waisl.assignent;
import java.util.Scanner;

public class Sumofdigits_10 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int r=0;
		int s=0;
		while(a>0) {
			r=a%10;
			s+=r;
			a=a/10;
			
			
			
		}
		
		System.out.println("The final output is "+s);
		
		// TODO Auto-generated method stub

	}

}
