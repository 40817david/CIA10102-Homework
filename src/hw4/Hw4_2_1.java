package hw4;

import java.util.Scanner;

public class Hw4_2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		char[] reverse = new char[str1.length()];
		int j = 0;

		for (int i = str1.length() - 1; i >= 0; i--) {

			reverse[j] = str1.charAt(i);
			j++;
		}

		System.out.println(reverse);
		
		sc.close();
	}

}
