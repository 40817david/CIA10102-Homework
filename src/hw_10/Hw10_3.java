package hw_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hw10_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期(年月日，例如20240214):");
		String input = sc.next();

		while (!input.matches("[1-9][0-9]{3}(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])")) {
			System.out.println("日期格式不正確，請再輸入一次!");
			System.out.println("請輸入日期(年月日，例如20240214):");
			input = sc.next();
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date inputDate = null;
		try {
			inputDate = sdf.parse(input);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年:");
		String changeType = sc.next();

		while (!changeType.matches("^[123]$")) {
			System.out.println("請依數字輸入要格式化的模式!");
			System.out.println("(1)年/月/日(2)月/日/年(3)日/月/年:");
			changeType = sc.next();
		}
		int changeNumber = Integer.parseInt(changeType);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");

		switch (changeNumber) {
		case 1:
			System.out.println(sdf1.format(inputDate));
			break;
		case 2:
			System.out.println(sdf2.format(inputDate));
			break;
		case 3:
			System.out.println(sdf3.format(inputDate));
			break;
		}
		sc.close();
	}
}
