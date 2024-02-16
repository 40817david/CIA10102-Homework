package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;

		while (true) {
			try {
				System.out.println("請輸入x的值:");
				x = sc.nextInt();
				System.out.println("請輸入y的值:");
				y = sc.nextInt();

				Caculator c = new Caculator(x, y);
				System.out.println("=========================");
				System.out.println(x + "的" + y + "次方等於" + c.powerXY());
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
				continue;
			} catch (RuntimeException re) {
				System.out.println("輸入格式不正確");
				continue;
			}
		}
	}
}
