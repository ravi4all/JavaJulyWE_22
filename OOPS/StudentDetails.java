package OOPS;

class StudentDetails {
    int rollno;
    String name;
    String course;
    String address;
    double fees;
    String sem;
    String collegeName;

    // Constructor - to initialize variables
    // Default Constructor
    public StudentDetails() {
        this.sem = "5th";
        this.collegeName = "DU";
    }

    // Parameterized Constructor
    public StudentDetails(int rollno, String name, String course, String address, double fees) {
        this(); // it will call default constructor
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.address = address;
        this.fees = fees;
    }

    // public void takeInput(int rollno, String name, String course, String address, double fees) {
    //     this.rollno = rollno;
    //     this.name = name;
    //     this.course = course;
    //     this.address = address;
    //     this.fees = fees;
    // }

    void showStudent() {
        System.out.println("Welcome to :: " + this.collegeName);
        System.out.println("Name is : " + this.name);
        System.out.println("RollNo is : " + this.rollno);
        System.out.println("Course is : " + this.course);
        System.out.println("Address is : " + this.address);
        System.out.println("Fees is : " + this.fees);
        System.out.println("Semester is : " + this.sem);
    }

    void marks(int math, int phy, int chem) {
        int total = math + phy + chem;
        System.out.println("Total Marks : " + total);
    }
}