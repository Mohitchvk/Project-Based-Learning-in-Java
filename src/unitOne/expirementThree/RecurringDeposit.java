package unitOne.expirementThree;

public class RecurringDeposit extends Account {

    int noOfMonths;
    boolean seniorCitizen;
    double ageOfACHolder;


    RecurringDeposit(double amount, int noOfMonths, double ageOfACHolder) {
        this.amount = amount;
        this.noOfMonths = noOfMonths;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    void calculateInterest() {
        if (noOfMonths<0 || amount<0 || ageOfACHolder<0){
            System.out.println("Invalid Info Provided");
            return;
        }

        seniorCitizen = ageOfACHolder > 60;

        if (noOfMonths <= 6) {
            if (seniorCitizen) interestRate = 8.00;
            else interestRate = 7.50;
        }
        if (noOfMonths <= 9) {
            if (seniorCitizen) interestRate = 8.25;
            else interestRate = 7.75;
        }
        if (noOfMonths <= 12) {
            if (seniorCitizen) interestRate = 8.50;
            else interestRate = 8.00;
        }
        if (noOfMonths <= 15) {
            if (seniorCitizen) interestRate = 8.75;
            else interestRate = 8.25;
        }
        if (noOfMonths <= 18) {
            if (seniorCitizen) interestRate = 9.00;
            else interestRate = 8.50;
        }
        if (noOfMonths <= 21) {
            if (seniorCitizen) interestRate = 9.25;
            else interestRate = 8.75;
        }


        calc();

    }
}
