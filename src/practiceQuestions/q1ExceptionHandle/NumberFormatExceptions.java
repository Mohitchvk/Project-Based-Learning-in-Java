package practiceQuestions.q1ExceptionHandle;

import java.util.Scanner;

public class NumberFormatExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        try {
            int number = Integer.parseInt(str);
            System.out.println("Your Answer is " + number*number);


        } catch (NumberFormatException e) {
            System.out.println("Exception "+e+" occured : You Entered Wrong Format ");
        }

        System.out.println("Thank You!!!");

    }
}
