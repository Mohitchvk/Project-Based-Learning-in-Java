package assignment1.q1;

import unitOne.expirementOne.EmployeeData;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of Elements");
            int n = Integer.parseInt(sc.nextLine());
            int arr[]=new int[n];
            System.out.println("Enter "+n+" Elements");

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }

            boolean flag = false;
            System.out.println("Enter index value");
            int givenindex = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                if (givenindex != arr[i]) continue;
                flag = true;
                System.out.println(arr[i]);
            }
            if (!flag) System.out.println("Given index doesn't exist");

        } catch (Exception e) {
            System.out.println("Error!!...You entered A Wrong Keyboard Input...Exiting");
        }

    }
}