package hw3;

import java.util.Scanner;

public class hw3_3 {

	public static void input1234(int number) {
		int count = 0;
		int []array1 = new int [35]; 

		for (int i = 1; i <= 49; i++) {
			if ((i - number) % 10 == 0 || (i / 10) == number) {
				continue;
			} else {
				array1[count] = i;
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("共有以上" + count + "個數字可以選");
	}

	public static void input56789(int number) {
		int count = 0;
		int []array2 = new int [44];

		for (int i = 1; i <= 49; i++) {
			if ((i - number) % 10 == 0) {
				continue;
			} else {
				array2[count] = i;
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("共有以上" + count + "個數字可以選");
	}

	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入你討厭哪個數字....\n請輸入數字1~9");
		int input = scanner.nextInt();

		if (input >= 1 && input <= 4) {
			input1234(input);
		}
		else if(input >= 5 && input <= 9){
			input56789(input);
		}
	}
}
