package hw4;

import java.util.Scanner;

public class Hw4_4 {

	public static void main(String[] args) {
		
		System.out.println("你今天要借多少錢......");
		
		int[][] array = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;
		
		while(input<0) {
			System.out.println("你今天到底要借多少錢......");
			input = sc.nextInt();
		}

		System.out.print("有錢可借的員工編號:");
		for (int i = 0; i < array[1].length; i++) {
			if (array[1][i] >= input) {
				System.out.print(array[0][i] + " ");
				count++;
			}
		}
		System.out.println("共" + count + "人!");
		
		sc.close();
	}

}
