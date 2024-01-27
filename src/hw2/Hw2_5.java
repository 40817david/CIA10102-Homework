package hw2;

public class Hw2_5 {

	public static void main(String[] args) {
		// 4 14 24 34 40 41 42 43 44 45 46 47 48 49

		int i, count = 0;

		loop: 
			for (i = 1; i <= 49; i++) {
			switch (i) {
			case 4:
				break;
			case 14:
				break;
			case 24:
				break;
			case 34:
				break;
			case 40:
				break loop;
			default:
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.print("\n共有" + count + "個數字可選");
	}

}
