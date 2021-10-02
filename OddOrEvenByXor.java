package October1Bitwise1;

public class OddOrEvenByXor {
	public static void main(String [] args) {
		int n=55;                   
		int mask = 1;
		int ans = n^mask;
		if(ans>n) {
			System.out.println("Even");
			
		}else {
			System.out.println("Odd");
		}
	}

}