package October1Bitwise1;

public class And {
	public static void main(String [] args) {
		int marks = 61;
		if(marks>=90 && marks<=100) {
			System.out.println("A+");
		}else if(marks>=80 && marks<90) {
			System.out.println("A");
		}else if(marks>=60 && marks<80) {
			System.out.println("B");
		}else if(marks>40 && marks<60) {
			System.out.println("C");
		}else {
			System.out.println("Failed");
		}
	}
}
