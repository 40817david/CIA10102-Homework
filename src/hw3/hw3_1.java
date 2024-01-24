package hw3;

import java.util.Scanner;

public class hw3_1 {
	public static void main(String args[]) {
		// 輸入文字
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		
		// 將輸入文字放入陣列
		int[] x = new int[3];
		for (int i = 0; i < 3; i++) {
			x[i] = scanner.nextInt();
		}
		
		// 將陣列元素做排序
		// Arrays.sort(x);

		// 設定條件

		if (x[0] == 0 && x[1] == 0 && x[2] == 0) {
			System.out.println("不是三角形");
		} else if (x[0] == x[1] && x[1] == x[2]) {
			System.out.println("正三角形");
		} else if (x[0] == x[2] && x[1] != x[0]) {
			System.out.println("等腰三角形");
		} else if (x[0] == 0 || x[1] == 0 || x[2] == 0) {
			System.out.println("不是三角形");
		} else {
			System.out.println("其他三角形");
		}
	} 
}


