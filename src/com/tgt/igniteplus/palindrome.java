package com.tgt.igniteplus;
import java.util.*;
public class palindrome
{
    public static void main(String[] args)
    {
        int rev=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=in.nextInt();
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            rev=(rev*10)+r;
        }
        if(temp==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
