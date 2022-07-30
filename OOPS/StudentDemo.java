package OOPS;

class Student {
    int rollno;
    String name;
    String course;
    String address;
    double fees;
    String sem;

    public void takeInput(int rollno, String name, String course, String address, double fees) {
        
    }

    void showStudent() {
        // System.out.println("Name is : " + name);
        // System.out.println("RollNo is : " + rollno);
        // System.out.println("Course is : " + course);
        // System.out.println("Address is : " + address);
        // System.out.println("Fees is : " + fees);
        // System.out.println("Semester is : " + sem);
        System.out.println("Name is : " + this.name);
        System.out.println("RollNo is : " + this.rollno);
        System.out.println("Course is : " + this.course);
        System.out.println("Address is : " + this.address);
        System.out.println("Fees is : " + this.fees);
        System.out.println("Semester is : " + this.sem);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student ram = new Student();

        ram.name = "Ram";
        ram.rollno = 10;
        ram.course = "BCA";
        ram.address = "Delhi";
        ram.fees = 45000.00;
        ram.sem = "2nd";
        ram.showStudent();

        // System.out.println("Name is : " + ram.name);
        // System.out.println("RollNo is : " + ram.rollno);
        // System.out.println("Course is : " + ram.course);
        // System.out.println("Address is : " + ram.address);
        // System.out.println("Fees is : " + ram.fees);
        // System.out.println("Semester is : " + ram.sem);

        System.out.println("===================");

        Student shyam = new Student();

        shyam.name = "Shyam";
        shyam.rollno = 12;
        shyam.course = "BCA";
        shyam.address = "Delhi";
        shyam.fees = 45000.00;
        shyam.sem = "2nd";
        shyam.showStudent();

        // System.out.println("Name is : " + shyam.name);
        // System.out.println("RollNo is : " + shyam.rollno);
        // System.out.println("Course is : " + shyam.course);
        // System.out.println("Address is : " + shyam.address);
        // System.out.println("Fees is : " + shyam.fees);
        // System.out.println("Semester is : " + shyam.sem);
    }
}
