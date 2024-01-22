package hw2;

public class hw2_1 {

	public static void main(String[] args) {
		int j = 0;

		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 1) {
				continue;
			}
			j += i;

		}
		System.out.println(j);
	}

}
