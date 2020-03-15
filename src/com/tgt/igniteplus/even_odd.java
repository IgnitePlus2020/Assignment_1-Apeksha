package com.tgt.igniteplus;
import java.util.*;
public class even_odd
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number of your choice");
        double a=in.nextDouble();
        if(a%2==0)      //check if completely divisible by 2
            System.out.println("The number you entered is even!");
        else
            System.out.println("The number you entered is odd!");
    }
}
