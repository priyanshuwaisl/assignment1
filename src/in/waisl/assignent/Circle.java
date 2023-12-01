package in.waisl.assignent;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the radius of circle");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = (3.14*r*r);
		double perimetre = 2*3.14*r;
		
		System.out.println("The perimetre is:"+perimetre);
		System.out.println("The area is:"+area);
		 
   }

}
