package basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataToFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("E:\\Jspiders\\sample.txt"); // If the file is not present it creates the
		// new file in specified location and stores the data
		// if the specified file is present then it overwrites the data
		// in order to append the data to already existing file we have to mention the
		// true keyword after mentioning
		// the filename like below
		// FileWriter fw = new FileWriter("E:\\Jspiders\\sample.txt",true);
		// then it appends the data to already existing file

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Hai \n");
		bw.write("Hello");

		System.out.println("Writed Succesfully");
		bw.close();
	}

}
