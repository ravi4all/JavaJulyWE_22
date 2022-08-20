interface I1 {
	int x = 12;
	void show();
}

interface I2 {
	int x = 100;
	void show();
}

interface I3 extends I1, I2 {
	int x = 150;
	void show();
}

class MyClass implements I3 {

	@Override
	public void show() {
		System.out.println(I1.x);
		System.out.println(I2.x);
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
