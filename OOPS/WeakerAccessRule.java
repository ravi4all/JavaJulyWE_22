package OOPS;

class P1 {
    protected void show() {
        System.out.println("Show method of P1 Class...");
    }
}

class C1 extends P1 {
    @Override
    public void show() {
        System.out.println("Show method of P1 Class...");
    }
}

public class WeakerAccessRule {
    
}
