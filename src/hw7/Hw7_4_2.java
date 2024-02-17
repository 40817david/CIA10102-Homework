package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Hw7_4_2 {

	public static void main(String[] args)throws Exception {
		File myFile = new File("C:/CIA101_Workspace/CIA10102-Homework/src/hw7/data/Object.ser");
		FileInputStream fis = new FileInputStream(myFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while(true) {
				((Animal) ois.readObject()).speak();
				System.out.println("-------------------------");
			}
		}catch(Exception e) {
			System.out.println("資料讀取完畢");
		}
		ois.close();
		fis.close();
		System.out.println("=========================");
	}

}
