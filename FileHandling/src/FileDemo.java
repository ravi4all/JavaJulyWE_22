import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".txt");
	}	
}

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		//String path = "D:/Trainings/OS_Notes.txt";
		String path = "D:/Trainings/java_notes.txt";
		File file = new File(path);
		if(file.exists()) {
			System.out.println("File Already Exists...");
			//file.delete();
		}
		else {
			file.createNewFile();
			System.out.println("New File Craeted...");
		}
		
//		file = new File("D:/JavaDir");
//		file.mkdir();
		
//		file = new File("D:/JavaDir/f1/f2/f3");
//		file.mkdirs();
		
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getName());
		
		file = new File("D:/Trainings");
		File total_files[] = file.listFiles();
		System.out.println("No of files : " + total_files.length);
		
		MyFilter filter  = new MyFilter();
		File text_files[] = file.listFiles(filter);
		System.out.println("No of Text files : " + text_files.length);
		
		File txtFiles[] = file.listFiles((dir, name) -> name.endsWith(".txt"));
		System.out.println("No of Text files : " + txtFiles.length);
	}

}
