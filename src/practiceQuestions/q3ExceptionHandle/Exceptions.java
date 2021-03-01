package practiceQuestions.q3ExceptionHandle;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            int n = Integer.parseInt(sc.nextLine());
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            System.out.println(sum);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception " + e + " occured : Your Entered Index DNE");
        } catch (NumberFormatException e) {
            System.out.println("Exception " + e + " occured : You Entered Wrong Format");
        } catch (NullPointerException e) {
            System.out.println("Exception " + e + " occured : Nothing Entered");
        }


    }
}
