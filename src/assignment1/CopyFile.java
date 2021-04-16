package assignment1;

import java.util.Scanner;

public class CopyFile {


    public static void main(String[] args) {
        byte b = 50;
        Byte input = new Byte(b); //LINE X
        Byte input1 = new Byte(b); //LINE Y
        Byte input2 = new Byte((byte)127); //LINE Z
    }

}