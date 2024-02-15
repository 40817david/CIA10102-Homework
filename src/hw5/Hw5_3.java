package hw5;

public class Hw5_3 {

	public int maxElement(int[][] array) {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		return max;
	}

	public double maxElement(double[][] array) {
		double max = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		Hw5_3 objs = new Hw5_3();
		System.out.println(objs.maxElement(intArray));
		System.out.println(objs.maxElement(doubleArray));

	}

}
