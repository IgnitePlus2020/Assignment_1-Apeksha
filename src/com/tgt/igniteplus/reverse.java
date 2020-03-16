package com.tgt.igniteplus;
import java.util.*;
public class reverse
{
    public static void main(String[] args)
    {   int rev=0,r=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=in.nextInt();
        while (n > 0)
        {
            r=n%10;
            n=n/10;
            rev=(rev*10)+r;
        }
        System.out.println("Reversed number:"+rev);
    }
}
