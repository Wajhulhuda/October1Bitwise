package October1Bitwise1;

public class OddOrEvenByAnd {
	public static void main(String [] args) {
		int n=99;                        ;
		int mask = 1;
		int ans = n&mask;
		if(ans>0) {
			System.out.println("Odd");
			
		}else {
			System.out.println("Even");
		}
	}

}
