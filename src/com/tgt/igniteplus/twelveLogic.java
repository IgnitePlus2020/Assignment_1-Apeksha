package com.tgt.igniteplus;
import java.util.*;
public class twelveLogic
{
    public static void main(String[] args)
    {
        int j=1,i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=in.nextInt();
        int a[]=new int[n];
        a[0]=1;
        a[1]=5;
        for(i=2;i<a.length;i++)
        {
            a[i]=a[i-2]+12*j++;
        }
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
