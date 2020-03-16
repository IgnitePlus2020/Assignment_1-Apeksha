package com.tgt.igniteplus;
import java.util.*;
public class binToDeci
{
    public static void main(String[] args)
    {   int d=0,r=0,i=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n=in.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            d=d+(r*(int)Math.pow(2,i));
            i++;
        }
        System.out.println(d);
    }
}
