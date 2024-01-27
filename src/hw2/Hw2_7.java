package hw2;

public class Hw2_7 {

	public static void main(String[] args) {
		int i, j;
		char wd = 'A';    //   A=/u0041~F=/u0046
		
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(wd);
			}
			wd++;
			System.out.println();
		}
		
		
	}
}