package hw5;

import java.util.Scanner;

public class Hw5_1 {
	public void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");

		int width = sc.nextInt();
		int height = sc.nextInt();

		Hw5_1 objs = new Hw5_1();

		objs.starSquare(width, height);
		
		sc.close();
	}
}
