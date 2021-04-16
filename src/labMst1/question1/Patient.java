package labMst1.question1;

import java.util.*;
import java.lang.*;
import java.io.*;

class Patient{

    String name= "Mohit";
    double height,weight;
    Patient(double w,double h)
    {
        weight=w;
        height=h;
    }
    double BMI()
    {
        System.out.println(name);
        return ((weight/(height*height))*703);
    }
}
