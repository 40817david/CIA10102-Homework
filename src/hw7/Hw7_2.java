package hw7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Hw7_2 {
	public static void main(String[] args) throws IOException {
		File myFile = new File("C:/CIA101_Workspace/CIA10102-Homework/src/hw7/Data.txt");
		FileWriter fw = new FileWriter(myFile, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

		for (int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * 1000 + 1);
			pw.println(random);
		}
		System.out.println("寫入完成");
		pw.close();
		bw.close();
		fw.close();
		System.out.println("=======================");

	}
}
