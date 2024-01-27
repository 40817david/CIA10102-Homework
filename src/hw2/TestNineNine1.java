package hw2;

public class TestNineNine1 {
	public static void main(String[]agrs) {
		int i, j;
		for(i=1;i<=9;i++) {
			j=1;
			while(j<=9) {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
	}
}
