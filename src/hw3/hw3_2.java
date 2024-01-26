package hw3;

import java.util.Scanner;

public class Hw3_2 {
	public static void main(String[] agrs) {
		// 輸入設定
		Scanner scanner = new Scanner(System.in);
		System.out.println("開始猜數字吧!，提示:1-100");
		int guess = 0;

		// 亂數設定
		int answer = (int) (Math.random() * 101);
		int start = 0;
		int end = 100;
		int count = 0;

		// 迴圈設定
		while (true) {
			guess = scanner.nextInt();
			count++;
			
			if (guess == answer) {
				System.out.println("答對了!答案就是" + answer);
				System.out.println("你總共猜了"+count+"次!");
				break;
			} 
			else if(guess>answer){
				end=guess;
				System.out.println("太大了!猜小一點!");
				System.out.println("提示:"+start+"-"+end);
			}
			else if(guess<answer){
				start=guess;
				System.out.println("太小了!猜大一點!");
				System.out.println("提示:"+start+"-"+end);
			}
			
			}
		
		
	}
}
