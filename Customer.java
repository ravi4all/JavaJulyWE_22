class Customer {
    public static void main(String args[]) {
    	// System.out.println("Hello World...");
        // System.out.println(args[0]);
        // System.out.println(args[1]);

        // String result = args[0] + args[1];
        
        // int x = Integer.parseInt(args[0]);
        // int y = Integer.parseInt(args[1]);
        // int result = x + y;
        // System.out.println("Sum is : " + result);

        int sum = 0;
        for(int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("Sum is : " + sum);

    }
}