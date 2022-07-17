package Basics;

public class P5_PrimeNumberV2 {
    public static void main(String[] args) {
        int minRange = 10;
        int maxRange = 100;
        for(int n = minRange; n < maxRange; n++) {
            boolean prime = true;
            if(n % 2 == 0 || n % 3 == 0) {
                prime = false;
            }
            for(int i = 5; i < n/2; i+=6) {
                if(n % i == 0 || n % i + 2 == 0) {
                    // System.out.println("Not Prime...");
                    prime = false;
                    break;
                }
            }
            if(prime) {
                System.out.println(n + " Prime Number...");
            }
            else {
                System.out.println(n + " Not Prime...");
            }
        }
    }
}
