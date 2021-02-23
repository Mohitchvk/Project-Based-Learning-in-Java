package unitOne.expirementThree;

public class SavingsBank extends Account {

    boolean nationality;

    SavingsBank(double amount, boolean nationality) {
        this.amount = amount;
        this.nationality = nationality;
    }

    @Override
    void calculateInterest() {
        if (amount<0){
            System.out.println("Invalid Info Provided");
            return;
        }
        if (nationality) interestRate = 4.00;
        else interestRate = 6.00;

        calc();

    }
}
