package OOPS;

public class EmployeeCaller {
    public static void main(String[] args) {
        EmployeeDetails ram = new EmployeeDetails(101, "Ram kuMAr sharMA", 45000);
        // cannot access private variables outside a class
        // ram.basicSalary += 1200;
        // System.out.println(ram.getName());
        // ram.setBasicSalary(ram.getBasicSalary() + 5000);
        // System.out.println(ram.getBasicSalary());
        System.out.println(ram.showEmp());
    }
}
