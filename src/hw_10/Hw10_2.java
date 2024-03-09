package hw_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hw10_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字");
		String input = sc.next();
		
		
		while(!input.matches("-?\\d+(\\.\\d+)?")) {
			System.out.println("數字格式不正確，請再輸入一次!");
			System.out.println("請輸入數字");
			input = sc.next();
		}
		
		double inputNumber = Double.parseDouble(input);
		
		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號:");
		String changeType = sc.next();
		while(!changeType.matches("^[123]$")) {
			System.out.println("請依數字輸入要格式化的模式!");
			System.out.println("(1)千分位(2)百分比(3)科學記號:");
			changeType = sc.next();
		}
		int changeNumber = Integer.parseInt(changeType);
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.##%");
		DecimalFormat df3 = new DecimalFormat("0.##E0");
		
		switch(changeNumber) {
		case 1:
			System.out.println(df1.format(inputNumber));
			break;
		case 2:
			System.out.println(df2.format(inputNumber));
			break;
		case 3:
			System.out.println(df3.format(inputNumber));
			break;
		}
		sc.close();
	}
}
