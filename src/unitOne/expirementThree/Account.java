package unitOne.expirementThree;

public abstract class Account {
    double interestRate;
    double amount;

    abstract void calculateInterest();
    void calc(){
        double finalAmount = amount * interestRate / 100;
        System.out.println("The Interest you get is: " + finalAmount);
    }
}
