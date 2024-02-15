package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x的值:");
		int x = sc.nextInt();
		System.out.println("請輸入y的值:");
		int y = sc.nextInt();
		
		try{
			Caculator c = new Caculator(x,y);
			System.out.println(x+"的"+y+"次方等於"+c.powerXY(x, y));
		}catch(CalException e) {
			e.printStackTrace();
		}
	}

}
