package hw1;

public class Hw1_3 {

	public static void main(String[] args) {
		int sec = 256559%60;
		int min = (256559/60)%60;
		int hour = (256559/60/60)%24;
		int day = 256559/60/60/24;
		
		System.out.println("256559秒為"+day+"天"+hour+"小時"+min+"分"+sec+"秒");
	}

}
