package hw3;

import java.util.Scanner;

public class Hw3_3 {

	int countNumber = 0;

	// 印出喜歡的數字

	public void numberPool(int number) {

		for (int i = 1; i <= 49; i++) {
			if ((i - number) % 10 == 0 || (i / 10) == number) {
				continue;
			} else {
				countNumber++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("共有以上" + countNumber + "個數字可以選");

	}

	// 將喜歡的數字放進陣列

	public int[] setArray(int number) {
		int[] array1 = new int[countNumber];
		int j = 0;
		for (int i = 1; i <= 49; i++) {
			if ((i - number) % 10 == 0 || (i / 10) == number) {
				continue;
			} else {
				array1[j] = i;
				j++;
			}
		}
		return array1;
	}

	// 於陣列中隨機選出6個數字

	// 不重複機制:將選過的數字設為0,若下次選到的數字為0就重選

	public void printRandom(int[] array2) {

		System.out.println("電腦亂數產號");

		for (int i = 0; i < 6; i++) {
			int j = (int) (Math.random() * countNumber);
			if (array2[j] == 0) {
				i--;
				continue;
			} else {
				System.out.print(array2[j] + " ");
			}
			array2[j] = 0;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入你討厭哪個數字....\n請輸入數字1~9");
		int input = scanner.nextInt();

		Hw3_3 object = new Hw3_3();

		// 範圍外數字判定
		while (input < 1 || input > 9) {
			System.out.println("不要亂打!請輸入範圍內之數字!(1~9)");
			input = scanner.nextInt();
		}

		object.numberPool(input);
		int[] arrayX = object.setArray(input);
		object.printRandom(arrayX);

		scanner.close();

	}
}
