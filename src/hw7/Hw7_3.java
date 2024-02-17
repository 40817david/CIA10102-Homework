package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hw7_3 {

	public void copyFile(File f1, File f2) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int i;
		while ((i = bis.read()) != -1) {
			bos.write(i);
		}
		System.out.println("複製一切順利");

		bos.close();
		bis.close();
		fos.close();
		fis.close();
		
		System.out.println("==============================");

	}

	public static void main(String[] args) {
		File myFile1 = new File("C:/CIA101_Workspace/CIA10102-Homework/src/hw7/Data.txt");
		File myFile2 = new File("C:/CIA101_Workspace/CIA10102-Homework/src/hw7/DataCopy.txt");

		Hw7_3 objs = new Hw7_3();
		try {
			objs.copyFile(myFile1, myFile2);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
