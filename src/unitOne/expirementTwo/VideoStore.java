package unitOne.expirementTwo;

import java.util.Scanner;

public class VideoStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStoreRequires storeRequires = new VideoStoreRequires();
        System.out.println("************* Welcome To Video Store ****************");
        String title = null;
        boolean flag = false;
        boolean flagTitle = true;

        try {
            do {
                if (flagTitle) {
                    System.out.println("Enter Title of the Video:");
                    title = sc.nextLine();
                    flagTitle = false;
                }
                System.out.println("************* Please Select an Option ****************");
                System.out.println("To Add the Video select Option_______________________:1 ");
                System.out.println("To Rent the Video select Option______________________:2 ");
                System.out.println("To Return the book select Option_____________________:3 ");
                System.out.println("To Check Rating for the Video select Option__________:4 ");
                System.out.println("To Check availability for the Video select Option____:5 ");
                System.out.println("To Change Video Title select Option__________________:6 ");
                System.out.println("To Exit form the Store select Option_________________:7 ");

                int option = Integer.parseInt(sc.nextLine());
                System.out.flush();

                System.out.println("********************* Processing... *******************");
                switch (option) {
                    case 1:
                        storeRequires.addVideo(title);
                        break;

                    case 2:
                        storeRequires.rentVideo(title);
                        break;

                    case 3:
                        storeRequires.returnVideo(title);
                        break;

                    case 4:
                        storeRequires.checkRating(title);
                        break;

                    case 5:
                        storeRequires.checkAvailability(title);
                        break;

                    case 6:
                        System.out.println("**************** Changing Book Title... ***************");
                        flagTitle = true;
                        title = null;
                        break;

                    case 7:
                        System.out.println("************* Thank you!!! visit again ****************");
                        flag = true;
                        break;

                    default:
                        System.out.println("Error!! : Please Select Valid Option");
                        break;
                }
            } while (!flag);


        } catch (Exception e) {
            System.out.println("Error!!...You entered A Wrong Keyboard Input...Exiting from Store");
        }

    }


}

