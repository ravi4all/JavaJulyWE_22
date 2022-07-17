package Basics;

public class P4_PrimeNumber {
    public static void main(String[] args) {
        int n = 17;
        boolean prime = true;
        for(int i = 2; i < n/2; i++) {
            if(n % i == 0) {
                // System.out.println("Not Prime...");
                prime = false;
                break;
            }
        }
        if(prime) {
            System.out.println("Prime Number...");
        }
        else {
            System.out.println("Not Prime...");
        }
    }
}
