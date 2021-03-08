package unitOne.expirementThree;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Interest -FD Select option ....1");
        System.out.println("Calculate Interest -RD Select option ....2");
        System.out.println("Calculate Interest -SB Select option ....3");
        System.out.println("To Reset Amount Select option ...........4");
        System.out.println("To Reset Age Select option ..............5");
        System.out.println("To Exit Select option ...................6");
        boolean flag = false;
        boolean flagAmount = true;
        boolean flagAge = true;
        double amount = 0.0;
        double age = 0.0;
        try {

            do {
                if (flagAmount) {
                    System.out.println("Enter The Amount:");
                    amount = Double.parseDouble(sc.nextLine());
                    flagAmount = false;
                }
                if (flagAge) {
                    System.out.println("Enter Your Age:");
                    age = Double.parseDouble(sc.nextLine());
                    flagAge = false;
                }
                System.out.println();
                System.out.println("************* Please Select an Option ****************");


                int option = Integer.parseInt(sc.nextLine());

                System.out.println("********************* Processing... *******************");
                switch (option) {
                    case 1:
                        System.out.println("Enter No. Of Days");
                        int time = Integer.parseInt(sc.nextLine());
                        FixedDeposit fd = new FixedDeposit(amount, time, age);
                        fd.calculateInterest();
                        break;

                    case 2:
                        System.out.println("Enter No. Of Months");
                        int timem = Integer.parseInt(sc.nextLine());
                        RecurringDeposit rd = new RecurringDeposit(amount, timem, age);
                        rd.calculateInterest();
                        break;

                    case 3:
                        System.out.println("Enter 1 if Indian Else 0");
                        int val = Integer.parseInt(sc.nextLine());
                        if(val==1) {
                            SavingsBank sb = new SavingsBank(amount, true);
                            sb.calculateInterest();

                        }
                        else {
                            SavingsBank sb = new SavingsBank(amount, false);
                            sb.calculateInterest();
                        }
                        break;

                    case 4:
                        flagAmount = true;
                        break;

                    case 5:
                        flagAge = true;
                        break;

                    case 6:
                        System.out.println("************* Thank you!!! visit again ****************");
                        flag = true;
                        break;

                    default:
                        System.out.println("Error!! : Please Select Valid Option");
                        break;
                }
            } while (!flag);


        } catch (Exception e) {
            System.out.println("Error!!...You entered A Wrong Keyboard Input...Exiting from Bank");
        }
    }
}
