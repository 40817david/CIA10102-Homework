package hw4;

import java.util.Scanner;

public class Hw4_2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb.reverse());
		
		sc.close();
	}
}
