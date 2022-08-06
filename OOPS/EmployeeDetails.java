package OOPS;

// S O L I D

// SRP - Single Responsibility Principle
// DRY - Donot Repeat Yourself

public class EmployeeDetails {
    // Data Abstraction - make variables private
    // Good Encapsulation - Data Abstraction + Encapsulation
    private int id;
    private String name;
    private double basicSalary;
    private String company;

    // Default Const...
    public EmployeeDetails() {
        this.company = "Brain Mentors";
    }

    // Parametrized Const...
    public EmployeeDetails(int id, String name, double basicSalary) {
        this();     // calling default constructor
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getter and Setter
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    private double getHRA() {
        return this.basicSalary * 0.15;
    }
    private double getTA() {
        return this.basicSalary * 0.10;
    }
    private double getDA() {
        return this.basicSalary * 0.18;
    }

    private double getTDS() {
        return this.basicSalary * 0.12;
    }

    // Show Net Payable Salary
    // Show currency with Salary
    // Show Name in proper format : Ram kumar sharma - Ram Kumar Sharma
    // Show current Date in IST format

    public String showEmp() {
        double netSalary = basicSalary + getHRA() + getDA() + getTA() - getTDS();
        CommonUtils utils = new CommonUtils();
        name = utils.getProperName(name);
        String date = utils.dateFormat();
        // System.out.println("Date is " + utils.dateFormat());
        String formatSalary = utils.formatSalary(netSalary);
        // System.out.println("Salary is : " + formatSalary);
        String dateMsg = "Date : " + date + "\n";
        String nameMsg = "Name is : " + name + "\n";
        String salMsg = "Net Salary is : " + formatSalary;
        return dateMsg + nameMsg + salMsg;
    }

}
