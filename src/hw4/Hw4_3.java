package hw4;

public class Hw4_3 {

	public static void main(String[] args) {
		String[] str = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				switch (str[i].charAt(j)) {
				case 'a', 'e', 'i', 'o', 'u':
					count++;
					break;
				}

			}
		}
		System.out.println("母音之數量(a,e,i,o,u)共有" + count + "個");
	}
}
