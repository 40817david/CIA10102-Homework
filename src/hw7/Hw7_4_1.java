package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Hw7_4_1 {

	public static void main(String[] args) throws Exception {
		File myDir = new File("C:/CIA101_Workspace/CIA10102-Homework/src/hw7/data");
		myDir.mkdir();
		File myFile = new File("C:/CIA101_Workspace/CIA10102-Homework/src/hw7/data/Object.ser");

		Animal[] animals = new Animal[4];

		animals[0] = new Dog("章魚");
		animals[1] = new Dog("魷魚");
		animals[2] = new Cat("花枝");
		animals[3] = new Cat("透抽");

		FileOutputStream fos = new FileOutputStream(myFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < animals.length; i++) {
			oos.writeObject(animals[i]);
		}
		System.out.println("寫入完成");
		oos.close();
		fos.close();
		System.out.println("===========================");

	}

}
