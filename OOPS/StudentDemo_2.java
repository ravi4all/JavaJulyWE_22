package OOPS;

class StudentA {
    int rollno;
    String name;
    String course;
    String address;
    double fees;
    String sem;

    public void takeInput(int rollno, String name, String course, String address, double fees) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.address = address;
        this.fees = fees;
    }

    void showStudent() {
        System.out.println("Name is : " + this.name);
        System.out.println("RollNo is : " + this.rollno);
        System.out.println("Course is : " + this.course);
        System.out.println("Address is : " + this.address);
        System.out.println("Fees is : " + this.fees);
        System.out.println("Semester is : " + this.sem);
    }
}


public class StudentDemo_2 {
    public static void main(String[] args) {
        StudentA ram = new StudentA();
        ram.takeInput(101, "Ram", "BCA", "Delhi", 4500);
        ram.showStudent();

        System.out.println("===================");

        StudentA shyam = new StudentA();
        shyam.takeInput(102, "Shyam", "BCA", "Delhi", 4500);
        shyam.showStudent();
    }
}
