package OOPS;

class Users {
    int id;
    String name;
}

class PrimeUsers extends Users {
    int phone;
}

class NormalFeatures {
    int deliveryCharges = 100;
    int deliveryTime = 4;
    Users showDetails() {
        int totalTime = deliveryTime + 2;
        Users obj = new Users();
        return obj;
    }
}

class PrimeFeatures extends NormalFeatures {
    int deliveryCharges = 0;
    int deliveryTime = 1;
    @Override
    PrimeUsers showDetails() {
        int totalTime = deliveryTime + 2;
        PrimeUsers obj = new PrimeUsers();
        return obj;
    }
}

public class CovariantReturnType {
    
}
