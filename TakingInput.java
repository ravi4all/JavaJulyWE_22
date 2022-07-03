import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter your name : ");
        // int x = System.in.read();   // read 1 byte at a time and return ASCII
        // System.out.println(x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID : ");
        int id = scanner.nextInt();

        System.out.println("Enter your Name : ");
        String name = scanner.next();

        System.out.println("Enter your Age : ");
        byte age = scanner.nextByte();

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();

        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);

        scanner.close();

    }
}
