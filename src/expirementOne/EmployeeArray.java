package expirementOne;

import java.util.Scanner;

public class EmployeeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EmployeeData[] eArr;
        eArr = new EmployeeData[4];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter uid, phno, name of employee:" + i);

            int uid = sc.nextInt();
            long phno = sc.nextLong();
            String name = sc.nextLine();

            eArr[i] = new EmployeeData(uid,name,phno);
        }

        boolean flag=false;
        int givenUid = sc.nextInt();
        for (int i=0;i<n;i++){
            if (givenUid!=eArr[i].eid) continue;
            flag=true;
            System.out.println(eArr[i].eid);
            System.out.println(eArr[i].name);
            System.out.println(eArr[i].phno);
        }
        if (!flag) System.out.println("Employee with given uid doesn't exist");

    }
}








// Method-2 Using 2-D Arrays
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no.of employees:");
//        int n = sc.nextInt();
//        int[][] eArr;
//        eArr = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter uid of employee:" + i);
//            int uid = sc.nextInt();
//            eArr[i][0] = uid;
//            System.out.println("Enter ph no. of employee:" + i);
//            int phno = sc.nextInt();
//            eArr[i][1] = phno;
//        }
//
//        for (int i=0;i<n;i++){
//            System.out.println("uid of employee:");
//            System.out.println(eArr[i][0]);
//            System.out.println("ph no. of employee:");
//            System.out.println(eArr[i][1]);
//
//        }
//
//
//        System.out.println("enter uid of employee to view his details:");
//        int givenUid = sc.nextInt();
//        int flag = 0;
//        for (int i = 0; i < n; i++) {
//            if (eArr[i][0] != givenUid) continue;
//            flag = 1;
//            System.out.println("ph no. of employee:");
//            System.out.println(eArr[i][1]);
//
//        }
//        if (flag == 0) System.out.println("Employee with given is UID not present");



