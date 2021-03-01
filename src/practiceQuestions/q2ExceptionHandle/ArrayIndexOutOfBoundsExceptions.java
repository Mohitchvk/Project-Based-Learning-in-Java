package practiceQuestions.q2ExceptionHandle;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int  arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(sc.nextLine());
        }

        System.out.println("Enter index");
        int i = Integer.parseInt(sc.nextLine());


        try {
            System.out.println(arr[i]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception "+e+" occured : Your Entered Index DNE");
        }


    }
}
