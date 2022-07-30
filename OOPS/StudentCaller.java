package OOPS;

public class StudentCaller {
    public static void main(String[] args) {
        // StudentDetails ram = new StudentDetails();   // calls default constructor
        StudentDetails ram = new StudentDetails(101, "Ram", "BCA", "Delhi", 4500.00);   // calls parameterixed constructor
        // ram.takeInput(101, "Ram", "BCA", "Delhi", 4500.00);
        ram.showStudent();
        ram.marks(90, 88, 67);

        System.out.println("========================");

        StudentDetails shyam = new StudentDetails(102, "Shyam", "BCA", "Delhi", 4500.00);
        // shyam.takeInput(102, "Shyam", "BCA", "Delhi", 4500.00);
        shyam.showStudent();
        shyam.marks(93, 80, 60);
    }
}