package com.tgt.igniteplus;
import java.util.*;
public class simpleinterest
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the principal amount\nRate of interest(per annum)\nTime period(in years) respectively");
        double p=in.nextDouble();
        double r=in.nextDouble();
        double t=in.nextDouble();
        double si=(p*t*r)/100;
        System.out.println("The simple interest for the given amount is = Rs:"+si);
    }
}
