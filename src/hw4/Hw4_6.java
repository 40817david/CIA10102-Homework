package hw4;

import java.util.Arrays;

public class Hw4_6 {
	
	public static int getMaxium(int[]array) {
		Arrays.sort(array);
		int maxium = array[array.length-1];
		return maxium;
	}
	
	public static void main(String[] args) {
		int[][] grade = { { 10, 35, 40, 100, 90, 85, 75, 70 }, 
						  { 37, 75, 77, 89, 64, 75, 70, 95 },
						  { 100, 70, 79, 90, 75, 70, 79, 90 }, 
						  { 77, 95, 70, 89, 60, 75, 85, 89 },
						  { 98, 70, 89, 90, 75, 90, 89, 90 }, 
						  { 90, 80, 100, 75, 50, 20, 99, 75 } };
		
		int[] studentNumber = {0,0,0,0,0,0};
		
		for(int i = 0 ; i < grade.length ; i++) {
			for(int j = 0 ; j < grade[i].length ; j++) {
				if(grade[i][j] == getMaxium(grade[i])) {
					studentNumber[j] += 1;
				}
			}
		}
		
		System.out.println("1號學生共考了"+studentNumber[0]+"次最高分");
		System.out.println("2號學生共考了"+studentNumber[1]+"次最高分");
		System.out.println("3號學生共考了"+studentNumber[2]+"次最高分");
		System.out.println("4號學生共考了"+studentNumber[3]+"次最高分");
		System.out.println("5號學生共考了"+studentNumber[4]+"次最高分");
		System.out.println("6號學生共考了"+studentNumber[5]+"次最高分");

		
	
	}

}
