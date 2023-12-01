package in.waisl.assignent;
import java.util.Scanner;


public class Array_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter size of array");
		int a= sc.nextInt();
		System.out.println("Enter the array");
		
		int num[]=new int[a];
		for(int i=0;i<a;i++) {
			num[i]=sc.nextInt();
			
		}
		
		if(num[0]==num[a-1]) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
	   
		

	}

}
