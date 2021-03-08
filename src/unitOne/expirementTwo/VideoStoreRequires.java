package unitOne.expirementTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoStoreRequires {

    int inc = 0;
    ArrayList<VideoData> Vdata = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addVideo(String title) {
        Vdata.add(new VideoData(title, true, 0.0f));
        inc++;
        System.out.println("Video Added Successfully");
    }

    void rentVideo(String title) {
        boolean flag = false;
        for (VideoData vdatum : Vdata) {
            if (!vdatum.title.equals(title)) continue;
            flag = true;
            if (!rentCheckAvailability(vdatum.availability)) continue;
            vdatum.availability = false;
            System.out.println("You have rented the video Successfully");
        }
        if (!flag) System.out.println("The Video with Given title Not found ");
    }

    void returnVideo(String title) {
        boolean flag = false;
        for (VideoData vdatum : Vdata) {
            if (!vdatum.title.equals(title)) continue;
            flag = true;
            if (returnCheckAvailability(vdatum.availability)) continue;
            vdatum.availability = true;
            System.out.println("You have returned the video Successfully");
            System.out.println("Please rate the video out of 5.0");
            float temp = sc.nextFloat();
            if (vdatum.rating != 0.0f) vdatum.rating = (temp + vdatum.rating) / 2;
            else vdatum.rating = temp;
        }
        if (!flag) System.out.println("The Video with Given title Not found");
    }


    void checkAvailability(String title) {
        boolean flag = false;
        for (VideoData vdatum : Vdata) {
            if (!vdatum.title.equals(title)) continue;
            flag = true;
            if (!rentCheckAvailability(vdatum.availability)) continue;
            System.out.println("The Book is Available");
        }   
        if (!flag) System.out.println("The Video with Given title Not found ");
    }

    boolean rentCheckAvailability(Boolean availability) {
        if (!availability) {
            System.out.println("The Video with given title currently unavailable");
            return false;
        }
        return true;
    }

    boolean returnCheckAvailability(Boolean availability) {
        if (availability) {
            System.out.println("The Video with given title is already with us");
            return true;
        }
        return false;
    }

    void checkRating(String title) {
        boolean flag = false;
        for (VideoData vdatum : Vdata) {
            if (!vdatum.title.equals(title)) continue;
            flag = true;
            System.out.println("The Book has a rating of " + vdatum.rating);
        }
        if (!flag) System.out.println("The Video with Given title Not found ");
    }


}
