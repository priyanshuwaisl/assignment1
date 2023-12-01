package in.waisl.assignent;

import java.util.Scanner;

public class Array_14 {

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
					System.out.print(num[i]+",");
					
					
				}
				System.out.println(" ");
				
		//sort the array
				int x;
				System.out.println("Original array->");
				for(int i=0;i<a;i++) {
					for(int j=1;j<=a-i-1;j++) {
						
						if(num[j-1]>num[j]) {
						
						 x=num[j];
						 num[j]=num[j-1];
						 num[j-1]=x;
						
						
					 }
						
					}
					
				}
				
				//print original array.
				System.out.println("Sorted array->");

				for(int i=0;i<a;i++) {
					System.out.print(num[i]+",");
					
					
				}
				System.out.println(" ");

				

	}

}
