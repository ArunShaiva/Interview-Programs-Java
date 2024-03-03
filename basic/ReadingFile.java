package basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("E:\\Jspiders\\Notes.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
	}

}

// Using Scanner we can read the file

/*
 * public class ReadingFile { public static void main(String[] args) throws
 * FileNotFoundException {
 * 
 * File file = new File("E:\\Jspiders\\Notes.txt");
 * 
 * Scanner sc = new Scanner(file);
 * 
 * while (sc.hasNextLine()) { System.out.println(sc.nextLine()); }
 * 
 * } }
 */
