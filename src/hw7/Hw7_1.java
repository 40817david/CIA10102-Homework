package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_1 {
	public static void main(String[] args) throws IOException {
		File myFile = new File("C:/CIA101_Workspace/CIA10102-Homework/src/hw7/Sample.txt");
		FileReader fr = new FileReader(myFile);
		BufferedReader br = new BufferedReader(fr);
		int count = 0;
		int line = 0;
		String str;
		// readLine()為讀整行文字,回傳字串

		while ((str = br.readLine()) != null) {
			count += str.length();
			line++;
		}
		System.out.println(myFile.getName() + "檔案中共有" + myFile.length() + "個位元組" + count + "個字元" + line + "列資料");
		br.close();
		fr.close();
	}
}
