package in.waisl.assignent;
import java.util.Scanner;
import java.util.Scanner;



public class Array_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int a= sc.nextInt();
		System.out.println("Enter the array");
		
		int num[]=new int[a];
		for(int i=0;i<a;i++) {
			num[i]=sc.nextInt();
			
		}
		
		//print original array.
		System.out.println("Original array->");

		for(int i=0;i<a;i++) {
			System.out.print(num[i]);
			
			
		}
		System.out.println(" ");

		
		
		//print reversed array.
				
		int x=num[0];
		System.out.println("Rotated array ->");
		for(int i=1;i<a;i++) {
			System.out.print(num[i]);
			
			
			
		}
		System.out.println(x);
		
		
		
		
		

	}

}
