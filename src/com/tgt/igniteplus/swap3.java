package com.tgt.igniteplus;
import java.util.*;
public class swap3
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the three numbers you wish to swap");
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double temp;
        System.out.println("Before swapping:Number_1 Number_2 and Number_3 are "+a+"\t"+b+"\t"+c);
        //Swapping
        temp=a;
        a=b;
        b=c;
        c=temp;
        System.out.println("After swapping:Number_1 Number_2 and Number_3 are "+a+"\t"+b+"\t"+c);
    }
}
