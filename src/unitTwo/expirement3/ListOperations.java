package unitTwo.expirement3;

import java.util.*;
public class ListOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        int choice = 0;
        String item;
        int index;

        do {
            System.out.println(" Insert.............press 1");
            System.out.println(" Search.............press 2");
            System.out.println(" Delete.............press 3");
            System.out.println(" Display............press 4");
            System.out.println(" Exit...............press 5");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to be inserted: ");
                    item = sc.nextLine();

                    boolean ans = list.contains(item);

                    if (ans){
                        System.out.println("Item already present in the list.");
                    }
                    else{
                        list.add(item);
                        System.out.println("Inserted successfully");
                    }

                    break;

                case 2:
                    System.out.print("Enter the item to search: ");
                    item = sc.nextLine();

                    ans = list.contains(item);

                    if (ans){
                        System.out.println("Item found in the list.");
                    }
                    else
                        System.out.println("Item not found in the list.");
                    break;

                case 3:
                    System.out.println("Enter the item to delete: ");
                    item = sc.nextLine();

                    ans = list.contains(item);

                    if (ans){
                        System.out.println("Deleted successfully");
                        list.remove(item);
                    }
                    else
                        System.out.println("Item not found in the list.");
                    break;

                case 4:
                    System.out.println("The Items in the list are: ");
                    System.out.println(list);
                    break;

                case 5:
                    System.out.println("*************************8");
            }

        } while (choice != 5);

        sc.close();
    }
}