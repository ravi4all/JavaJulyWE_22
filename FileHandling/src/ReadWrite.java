import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		
		String path = "D:/Trainings/OS_Notes.txt";
		File file = new File(path);
//		EOF - End of File
		final int EOF = -1;
//		if(file.exists()) {
////			Reading a file
//			FileInputStream fs = new FileInputStream(file);
//			int singleByte = fs.read();
//			while(singleByte != EOF) {
//				System.out.print((char)singleByte);
//				singleByte = fs.read();
//			}
//			fs.close();
//		}
		
		String path_2 = "D:/Trainings/java_notes.txt";
		file = new File(path_2);
		System.out.println("Enter data to write in file : ");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		FileOutputStream fo = new FileOutputStream(file);
		fo.write(text.getBytes());
		fo.close();
		System.out.println("Data Written...");
		scanner.close();

	}

}
