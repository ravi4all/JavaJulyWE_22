//Functional Interface : interface that contains only one method

@FunctionalInterface
interface Calc {
	int compute(int x, int y);
}

// Using Class Way
//class MyCalc implements Calc {
//
//	@Override
//	public int compute(int x, int y) {
//		System.out.println("Calc App...");
//		int z = x + y;
//		return z;
//	}
//}

public class InterfaceUseWays {

	public static void main(String[] args) {
//		MyCalc obj = new MyCalc();
//		int res = obj.compute(12, 10);
//		System.out.println("Sum is : " + res);
		
		// Using Object Way
		// Anonymous Class : class that has no name
		// will create a class on runtime and object of that class
//		Calc obj = new Calc() {
//
//			@Override
//			public int compute(int x, int y) {
//				System.out.println("Calc App...");
//				int z = x + y;
//				return 0;
//			}
//		};
		
		// Using Lambda
		// lambda function without body
//		Calc c = (a,b) -> a + b;
//		System.out.println("Sum is : " + c.compute(12, 10));
		
		// Lambda function with body
		Calc c = (a,b) -> {
			System.out.println("Calc App...");
			int z = a + b;
			return z;
		};
		System.out.println("Sum is : " + c.compute(12, 10));
		
		
	}

}
