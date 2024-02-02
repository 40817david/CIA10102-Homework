package hw4;

import java.util.Scanner;

public class Hw4_5 {

	public static void main(String[] args) {

		// 閏年:4的倍數&&不是100的倍數||400的倍數
		// 31天:1.3.5.7.8.10.12
		// 30天:4.6.9.11

		Scanner sc = new Scanner(System.in);
		
		//年份輸入
		System.out.println("請輸入年份(提示:西元yyyy年)");
		int year = sc.nextInt();

		//月份輸入及判定
		System.out.println(year+"/mm/dd");
		System.out.println("請輸入月份");
		int month = sc.nextInt();
		while(month < 1 || month > 12) {
			System.out.println("請輸入正確月份(1~12)");
			month = sc.nextInt();
		}
		
		//日期輸入
		System.out.println(year+"/"+month+"/dd");
		System.out.println("請輸入日期");
		int day = sc.nextInt();
		
		//大小月天數判定
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			while (day < 1 || day > 31) {
				System.out.println(year+"/"+month+"/dd");
				System.out.println("請按照月份輸入正確之日期(1~31)");
				day = sc.nextInt();
			}break;
		case 4, 6, 9, 11:
			while (day < 1 || day > 30) {
				System.out.println(year+"/"+month+"/dd");
				System.out.println("請按照月份輸入正確之日期(1~30)");
				day = sc.nextInt();
			}break;
		}
		
		//閏年2月天數判定
		if(month == 2 && !(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
			while (day < 1 || day > 28) {
				System.out.println(year+"/"+month+"/dd");
				System.out.println("請按照月份輸入正確之日期(1~28)");
				day = sc.nextInt();
			}
		}else if (month == 2 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			while (day < 1 || day > 29) {
				System.out.println(year+"/"+month+"/dd");
				System.out.println("請按照月份輸入正確之日期(1~29)");
				day = sc.nextInt();
			}
		}

			//閏年與非閏年之計算
			int[] normalYear = { 0, 31, 28, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
			int[] leapYear = { 0, 31, 29, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30 };

			int totalDays = 0;

			
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				for (int i = 0; i <= month - 1; i++) {
					totalDays += leapYear[i];
				}
				System.out.println(year+"/"+month+"/"+day);
				System.out.println("輸入日期為該年的第" + (totalDays + day) + "天");
			} else {
				for (int i = 0; i <= month - 1; i++) {
					totalDays += normalYear[i];
				}
				System.out.println(year+"/"+month+"/"+day);
				System.out.println("輸入日期為該年的第" + (totalDays + day) + "天");
			}

			sc.close();

		
	}
}
