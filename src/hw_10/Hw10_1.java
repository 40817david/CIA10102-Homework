package hw_10;

public class Hw10_1 {
	
	public static int isPrime(int number) {
		
		int count = 0;

		for(int i = 1 ; i <= number ; i++ ) {
			if(number % i ==0) {
				count++;
			}
		}
		return count;
	}
		

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int number = (int) (Math.random() * 101) + 1;
			
			if (isPrime(number)==2) {
				System.out.println(number + "是質數");
			} else {
				System.out.println(number + "不是質數");
			}
		}
	}
}
