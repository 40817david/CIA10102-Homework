package hw2;

public class hw2_6 {

	public static void main(String[] args) {
		int i, j;
		for (i = 0; i <= 9; i++) {
			for (j = 1; j <= 10 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
