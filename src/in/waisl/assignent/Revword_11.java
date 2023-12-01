package in.waisl.assignent;

import java.util.Scanner;

public class Revword_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		System.out.println("Orignal string"+s);
		char ch;
		String ns=""; 
		
		
		for(int i=0;i<s.length();i++) {
			
			ch = s.charAt(i);
			ns=ch+ns;
			
		}
		
		System.out.println(ns);
		

	}

}
