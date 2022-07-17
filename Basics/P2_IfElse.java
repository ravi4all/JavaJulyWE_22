package Basics;

public class P2_IfElse {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 20;
        // if(a > b) {
        //     System.out.println("A is greater...");
        // }
        // else {
        //     System.out.println("B is greater...");
        // }

        // String res = (a > b) ? "A is greater" : "B is greater";
        // System.out.println(res);

        if(a > b && a > c) {
            System.out.println("A is greatest...");
        }
        else if(b > c && b > a) {
            System.out.println("B is greatest...");
        }
        else {
            System.out.println("C is greatest...");
        }

    }
}
