package October1Bitwise1;

import java.util.Scanner;

public class AddANDorOR {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter the operation, & or | ");
		char operation = sc.next().charAt(0);
		if(operation == '&') {
			System.out.println("The And of two number is "+isAnd(num1, num2));
		}else if(operation == '|') {
			System.out.println("The Or of two number is "+isOr(num1,num2));
		}else {
			System.out.println("Wrong opetion");
		}
	}
	public static int isAnd(int num1, int num2) {
		return num1 & num2;
	}
	
	public static int isOr(int num1, int num2) {
		return num1 | num2;
	}

}
