package unitOne.expirementThree;

public class FixedDeposit extends Account {

    int noOfDays;
    double ageOfACHolder;
    boolean seniorCitizen;
    FixedDeposit(double amount,int noOfDays,double ageOfACHolder){
        this.amount=amount;
        this.noOfDays=noOfDays;
        this.ageOfACHolder=ageOfACHolder;
    }

    @Override
    void calculateInterest() {
        if (noOfDays<0 || amount<0 || ageOfACHolder<0){
            System.out.println("Invalid Info Provided");
            return;
        }
        seniorCitizen = ageOfACHolder > 60;

        if (noOfDays>=7 && noOfDays<=14){
            if (amount>10000000) interestRate=6.50;
            else if (seniorCitizen) interestRate = 5.00;
            else interestRate = 4.50;
        }
        if (noOfDays>=15 && noOfDays<=29){
            if (amount>10000000) interestRate=6.75;
            else if (seniorCitizen) interestRate=5.25;
            else interestRate=4.75;
        }
        if (noOfDays>=30 && noOfDays<=45){
            if (amount>10000000) interestRate=6.75;
            else if (seniorCitizen) interestRate=6.00;
            else interestRate=5.50;
        }
        if (noOfDays>=45 && noOfDays<=60){
            if (amount>10000000) interestRate=8.00;
            else if (seniorCitizen) interestRate=7.50;
            else interestRate=7.00;
        }
        if (noOfDays>=61 && noOfDays<=184){
            if (amount>10000000) interestRate=8.50;
            else if (seniorCitizen) interestRate=8.00;
            else interestRate=7.50;
        }
        if (noOfDays>=185 && noOfDays<=365){
            if (amount>10000000) interestRate=10.00;
            else if (seniorCitizen) interestRate=8.50;
            else interestRate=8.00;
        }

        calc();

    }
}
