package in.waisl.assignent;
import java.util.Scanner;


public class Table_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		
		
		for(int i =1;i<=10;i++) {
			int k = a*i;
			System.out.println(""+a+" * "+i+" = "+k);
			
			
		}
		
		
		

	}

}
