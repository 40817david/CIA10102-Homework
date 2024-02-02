package hw4;

public class Hw4_6 {
	
	
	//取出每次考試的最高分
	public static int getMaxium(int[]array) {
		int maxium = 0;
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] > maxium) {
				maxium = array[i];
			}
		}
		return maxium;
	}
	
	
	public static void main(String[] args) {
		
		//考試分數
		int[][] grade = { { 10, 35, 40, 100, 90, 85, 75, 70 }, 
						  { 37, 75, 77, 89, 64, 75, 70, 95 },
						  { 100, 70, 79, 90, 75, 70, 79, 90 }, 
						  { 77, 95, 70, 89, 60, 75, 85, 89 },
						  { 98, 70, 89, 90, 75, 90, 89, 90 }, 
						  { 90, 80, 100, 75, 50, 20, 99, 75 } };			
		
		//學生考最高分次數
		int[] studentNumber = new int [8];

		for(int i = 0 ; i < grade.length ; i++) {
			for(int j = 0 ; j < grade[i].length ; j++) {
				if(grade[i][j] == getMaxium(grade[i])) {
					studentNumber[j]++;
					break;
				}
			}
		}
		
		//印出次數
		for(int i = 0 ; i < grade[0].length ; i++) {
			System.out.println((i+1)+"號學生共考了"+studentNumber[i]+"次最高分");
		}

	
	}

}
