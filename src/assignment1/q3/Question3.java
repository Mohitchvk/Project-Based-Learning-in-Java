package assignment1.q3;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        String str = sc.nextLine();

        try {
            int x = Integer.parseInt(str);
            System.out.println("The square value is: " + x * x);
            System.out.println("The work has been done successfully");
        } catch (NumberFormatException e) {
            System.out.println("Entered input is not a valid format for an integer.");
            //e.printStackTrace();
        }

        sc.close();

    }

}