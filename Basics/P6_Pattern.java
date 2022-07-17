package Basics;

public class P6_Pattern {
    public static void main(String[] args) {
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("============================");

        // *
        // **
        // ***
        // ****
        // *****
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("============================");

        // 1
        // 12
        // 123
        // 1234
        // 12345
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        System.out.println("============================");

        // 12345
        // 1234
        // 123
        // 12
        // 1
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j <= 5-i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

    }
}
