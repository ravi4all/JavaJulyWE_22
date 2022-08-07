package OOPS;

class Account {
    int accNo;
    String accHolderName;

    void openAcc() {
        System.out.println("Open New Account...");
    }
    void deposit() {
        System.out.println("Deposit function of Account Class...");
    }
    void withdraw() {
        System.out.println("Withdraw function of Account Class...");
    }
}

class SavingAccount extends Account {
    double minBalance;

    // annotation
    @Override
    void withdraw() {
        System.out.println("Withdraw function of Saving Acc Class...");
    }

    void computeROI() {
        System.out.println("SA ROI is 6.5%");
    }
}

class CurrentAccount extends Account {
    double withdrawLimit;
    // Over Draft Limit
    void computeOD() {
        System.out.println("OD limit is 1 Lac");
    }

    @Override
    void deposit() {
        System.out.println("Deposit function of Current Acc Class...");
    }
}

public class ISA_Demo {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.withdraw();  // saving account class withdraw
        sa.deposit();   // account class deposit
        sa.computeROI(); // saving account class computeROI

        CurrentAccount ca = new CurrentAccount();
        ca.withdraw();  // current account class withdraw
        ca.deposit();   // account class deposit
        ca.computeOD(); // current account class computeROI
    }
}
