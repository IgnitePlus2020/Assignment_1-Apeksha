package com.tgt.igniteplus;
import java.util.*;
public class armstrong
{
    public static void main(String[] args)
    {
        int res=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=in.nextInt();
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            res=res+(int)Math.pow(r,3);
        }
        if(res==temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an armstrong number");
    }
}
