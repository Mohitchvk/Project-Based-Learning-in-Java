package assignment1;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String args[])   {

        try          {

            FileOutputStream fout=new FileOutputStream("D:\\sanfoundry.txt");

            String s="Welcome to Sanfoundry.";

            byte b[]=s.getBytes();//converting string into byte array

            fout.write(b);

            fout.close();

            System.out.println("Success");

        } catch(Exception e){

            System.out.println(e);

        }

    }

}