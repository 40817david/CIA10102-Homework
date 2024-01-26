package hw3;

import java.util.Scanner;

public class Hw3_3 {

	int countNumber = 0;

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
		System.out.print("共有以上" + countNumber + "個數字可以選");

	}

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

		object.numberPool(input);
		int[] arrayX = object.setArray(input);
		object.printRandom(arrayX);

	}
}
