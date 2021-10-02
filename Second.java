package October1Bitwise1;

public class Second {
	public static void main(String [] args) {
		int x=5;
		int y=9;
		int ans = x&y;
		int ans1 = x|y;
		if(ans>10 && ans <20) {
			System.out.println("Value is in between 10 to 20");
			
		}else {
			System.out.println(ans);
		}
		if(ans1>10 || ans1<20) {
			System.out.println(ans1);
		}
	}

}
