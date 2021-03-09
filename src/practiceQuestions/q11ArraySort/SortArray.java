package practiceQuestions.q11ArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(sc.nextLine());

        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);

        }

    }
}
