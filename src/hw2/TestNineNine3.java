package hw2;

public class TestNineNine3 {

	public static void main(String[] args) {
		int i = 1, j;
		while (i <= 9) {
			j = 1;
			do {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}

}
