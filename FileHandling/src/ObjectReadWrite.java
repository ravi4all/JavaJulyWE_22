import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Task implements Serializable {
	private String emailId;
	private String username;
	private int taskId;
	private String taskName;
	
	public Task(String emailId, String username, int taskId, String taskName) {
		this.emailId = emailId;
		this.username = username;
		this.taskId = taskId;
		this.taskName = taskName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
}

public class ObjectReadWrite {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Task obj = new Task("ram@gmail.com", "Ram Sharma", 101, "Study Java");
//		FileOutputStream fo = new FileOutputStream("task_data.dat");
//		ObjectOutputStream os = new ObjectOutputStream(fo);
//		
//		os.writeObject(obj);
//		os.close();
//		fo.close();
//		System.out.println("Object Written...");
		
		System.out.println("Reading Object");
		FileInputStream fs = new FileInputStream("task_data.dat");
		ObjectInputStream oi = new ObjectInputStream(fs);
		Task obj = (Task)oi.readObject();
		System.out.println(obj.getEmailId() + ", " + obj.getTaskName());
		oi.close();
		fs.close();

	}

}
