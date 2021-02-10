package unitOne.expirementOne;

import java.util.Scanner;

public class EmployeeArray {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of Employees");
            int n = Integer.parseInt(sc.nextLine());
            EmployeeData[] eArr;
            eArr = new EmployeeData[4];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter uid, phno, name of employee:" + i);

                int uid = Integer.parseInt(sc.nextLine());
                long phno = Long.parseLong(sc.nextLine());
                String name = sc.nextLine();

                eArr[i] = new EmployeeData(uid, name, phno);
            }

            boolean flag = false;
            System.out.println("Enter of Employee id of employee you want to search details about");
            int givenUid = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                if (givenUid != eArr[i].eid) continue;
                flag = true;
                System.out.println(eArr[i].eid);
                System.out.println(eArr[i].name);
                System.out.println(eArr[i].phno);
            }
            if (!flag) System.out.println("Employee with given uid doesn't exist");

        } catch (Exception e) {
            System.out.println("Error!!...You entered A Wrong Keyboard Input...Exiting");
        }

    }
}

