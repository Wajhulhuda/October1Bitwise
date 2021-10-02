package October1Bitwise1;

public class SwapNUmberByXor {
	public static void main(String [] args) {
		int a=5;
		int b= 8;
		System.out.println("The value of a = "+a+" And value of b= "+b);
		 a = a^b;
		 b=a^b;
		 a=a^b;
		 /* int temp =a;
		  * a=b;
		  * b=temp;
		  */
		 System.out.println("Value of a ="+a+" and b= "+b);
	}
}
