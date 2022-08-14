package OOPS;

class X {
    int x = 120;
    void show() {
        System.out.println("Show Method of X Class...");
    }
}

class Y extends X {
    int x = 10;
    @Override
    void show() {
        System.out.println("Show Method of X Class...");
    }
}

public class MethodOverridingVsVariable {
    public static void main(String[] args) {
        // Y obj = new Y();
        // System.out.println(obj.x);

        // Upcasting
        // variables are binded with class
        // methods are binded with object
        X obj = new Y();
        obj.show(); // will call child class method
        System.out.println(obj.x);  // will call parent class variable
    }
}
