package programs;

import java.util.Scanner;

public class conditionalstatements {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		if(age>18) {
			System.out.println("Eligible to vote");
		}
		
		else {
			System.out.println("Not Eligible to vote");
		}
		
	}
}
