package hw4;

import java.util.Scanner;

public class Hw4_5 {
	
	public void leapYear() {
		
	}
	
	public void normalYear() {
		
	}

	public static void main(String[] args) {
		//閏年:4的倍數&&400的倍數
		//31天:1.3.5.7.8.10.12
		//30天:4.6.9.11
		System.out.println("請分別輸入年、月、日");
		System.out.println("提示:西元yyyy年，mm月，dd日");
		Scanner sc =  new Scanner(System.in);
		
		int[]input = new int[3];
		 for(int i =0;i<input.length;i++) {
			 input[i]=sc.nextInt();
		 }
	}

}
