package hw5;

public class Hw5_5 {

	public void genAuthCode() {

		int[] array = new int[8];

		for (int i = 0; i < array.length; i++) {
			while (true) {
				int r = (int) (Math.random() * 75 + 48);
				if ((r >= 48 && r <= 57) || (r >= 65 && r <= 90) || (r >= 97 && r <= 122)) {
					array[i] = r;
					System.out.print((char) (array[i]));
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		Hw5_5 objs = new Hw5_5();
		System.out.println("本次隨機產生驗證碼為:");
		objs.genAuthCode();
	}

}
