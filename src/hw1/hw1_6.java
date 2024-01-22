package hw1;

public class hw1_6 {

	public static void main(String[] args) {
		System.out.println(5 + 5);
		//兩個5皆為整數5，故此時的"+"將兩者做加法運算，得出結果為10
		
		System.out.println(5 +'5');
		//第一個5為整數5，'5'以單括號包住後視為字元型態，若將字元類型資料做加法之運算，
		//會將其轉為對應Unicode之值後再去做計算，'5'的Unicode代號為0053，
		//所以此時的加法運算為5+53，得出結果為58
		
		System.out.println(5 + "5");
		//第一個5為整數5，"5"以雙括號包住則直接視為文字，此時的"+"不做加法運算，
		//而是直接做字串連接，故得到結果為55
	}

}
