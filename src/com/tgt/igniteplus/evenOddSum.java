package com.tgt.igniteplus;
import java.util.*;
public class evenOddSum
{
    public static void main(String[] args)
    {   int esum=0,osum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number of your choice:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
                esum=esum+i;
            else
                osum=osum+i;
        }
        System.out.println("Sum of even digits:"+esum);
        System.out.println("Sum of even digits:"+osum);
    }
}
