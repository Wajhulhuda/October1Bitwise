package October1Bitwise1;

import java.util.Scanner;

public class OddOrEvenByOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for checking..");
		int num = sc.nextInt();
		
		if((num | 1) >num) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
