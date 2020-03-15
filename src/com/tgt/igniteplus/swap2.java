package com.tgt.igniteplus;
import java.util.*;
public class swap2
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the two numbers you wish to swap");
        double i=in.nextDouble();
        double j=in.nextDouble();
        double temp;
        //swapping
        System.out.println("Before swapping:Number_1 and Number_2 are "+i+"\t"+j);
        temp=i;
        i=j;
        j=temp;
        System.out.println("After swapping:Number_1 and Number_2 are "+i+"\t"+j);
    }
}
