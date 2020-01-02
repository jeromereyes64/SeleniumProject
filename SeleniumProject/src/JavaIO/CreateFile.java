package JavaIO;

import java.io.*;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
	
	public static void main(String[] args) throws IOException {
		File myFile = new File("sample.txt");
		FileWriter myFileWriter = new FileWriter("sample.txt");
		
		try {
			myFile.createNewFile();
			System.out.println(myFile.getName());
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error Occured");
			e.printStackTrace();
		}
	
		
		try {
			myFileWriter.write("Yehey, success ! Study Hard ! ");
			System.out.println(myFile.canWrite());
			myFileWriter.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}	
}
